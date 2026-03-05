package battleshipRMI.server;

import battleshipRMI.shared.model.game.user.UserMode;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private final String name;
    private final int maxPlayers;
    private final List<String> players;
    private final List<String> spectators;
    private final List<String> admins;
    private GameState gameState;

    public Room(String name, int maxPlayers) {
        this.name = name;
        this.maxPlayers = maxPlayers;
        this.players = new ArrayList<>();
        this.spectators = new ArrayList<>();
        this.admins = new ArrayList<>();
        this.gameState = new GameState();
    }

    public void addUser(String user, UserMode mode) {
        switch (mode) {
            case PLAYER -> players.add(user);
            case SPECTATOR -> spectators.add(user);
            case ADMIN -> admins.add(user);
        }
    }

    public void removeUser(String user) {
        players.remove(user);
        spectators.remove(user);
        admins.remove(user);
    }

    public boolean isFull() {
        return players.size() >= maxPlayers;
    }
}
