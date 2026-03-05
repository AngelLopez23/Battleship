package battleshipRMI.server;

import battleshipRMI.shared.model.game.AttackReport;
import battleshipRMI.shared.model.game.user.UserMode;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IGameServer extends Remote {
    void registerUser(String userName, IClientCallback client) throws RemoteException;
    void createRoom(String roomName, int nPlayers, String creator) throws RemoteException;
    void joinRoom(String roomName, UserMode mode, String user) throws RemoteException;
    void leaveRoom(String user) throws RemoteException;
    void startGame(String roomName) throws RemoteException;
    void collectShots() throws RemoteException;
    void processTurnResults(List<AttackReport> results) throws RemoteException;
    void sendAdminLogs(String message) throws RemoteException;
    void sendSpectatorUpdates(GameState gameState) throws RemoteException;
}
