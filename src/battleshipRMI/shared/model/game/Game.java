package battleshipRMI.shared.model.game;

import battleshipRMI.shared.model.game.ocean.Ocean;
import battleshipRMI.shared.model.game.ocean.Point;
import battleshipRMI.shared.model.game.user.StatusChangedListener;
import battleshipRMI.shared.model.ships.Ship;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class Game implements Serializable {
    private Ocean ocean;
    private int fleetHealth;
    private int availableTorpedo;
    private EnumSet<GameMode> gameMode;
    private final List<StatusChangedListener> listeners;

    public Game(int horizontal, int vertical) {
        this.ocean = new Ocean(horizontal, vertical);
        this.fleetHealth = 0;
        this.availableTorpedo = 0;
        this.gameMode = EnumSet.of(GameMode.NO_OPTIONS);
        this.listeners = new ArrayList<>();
    }

    public void placeShipsOnOcean(int[] counters) {
        List<Ship> ships = Ship.convertInputIntegersToShips(counters);
        this.fleetHealth = ships.stream().mapToInt(Ship::getLength).sum();
        this.ocean = Ocean.randomPlace(ships, ocean);
    }

    public void setGameMode(EnumSet<GameMode> mode, int torpedoCounter) {
        this.gameMode = mode;
        this.availableTorpedo = torpedoCounter;
    }

    public AttackReport hitOnPlace(Point point, FiringMode mode) {
        // TODO: Implement real attack behavior.
        return new AttackReport(null, AttackReport.HitResult.MISS, point, fleetHealth, null);
    }

    public void addListener(StatusChangedListener user) {
        listeners.add(user);
    }
}
