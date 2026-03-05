package battleshipRMI.server;

import battleshipRMI.shared.model.game.AttackReport;
import battleshipRMI.shared.model.game.user.UserMode;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameServer extends UnicastRemoteObject implements IGameServer {
    private final Map<String, IClientCallback> users;
    private final Map<String, Room> rooms;

    public GameServer() throws RemoteException {
        this.users = new HashMap<>();
        this.rooms = new HashMap<>();
    }

    @Override
    public void registerUser(String userName, IClientCallback client) {
        users.put(userName, client);
    }

    @Override
    public void createRoom(String roomName, int nPlayers, String creator) {
        Room room = new Room(roomName, nPlayers);
        room.addUser(creator, UserMode.ADMIN);
        rooms.put(roomName, room);
    }

    @Override
    public void joinRoom(String roomName, UserMode mode, String user) {
        Room room = rooms.get(roomName);
        if (room != null) {
            room.addUser(user, mode);
        }
    }

    @Override
    public void leaveRoom(String user) {
        for (Room room : rooms.values()) {
            room.removeUser(user);
        }
    }

    @Override
    public void startGame(String roomName) {
        // TODO: Create and initialize match for this room.
    }

    @Override
    public void collectShots() {
        // TODO: Receive shots from players for current turn.
    }

    @Override
    public void processTurnResults(List<AttackReport> results) {
        // TODO: Update room state and notify clients.
    }

    @Override
    public void sendAdminLogs(String message) {
        // TODO: Send logs only to admin users.
    }

    @Override
    public void sendSpectatorUpdates(GameState gameState) {
        // TODO: Send read-only updates to spectators.
    }
}
