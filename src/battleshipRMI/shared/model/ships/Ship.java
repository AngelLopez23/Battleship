package battleshipRMI.shared.model.ships;

import battleshipRMI.shared.model.game.FiringMode;
import battleshipRMI.shared.model.game.HealthReport;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class Ship implements Serializable {
    protected int health;

    protected Ship(int health) {
        this.health = health;
    }

    public HealthReport hitTheShip(FiringMode mode) {
        if (mode == FiringMode.TORPEDO_FIRING_MODE) {
            int score = health;
            health = 0;
            return new HealthReport(health, score);
        }
        if (health > 0) {
            health--;
            return new HealthReport(health, 1);
        }
        return new HealthReport(0, 0);
    }

    public abstract int getLength();

    public abstract void restoreHealthInRecoveryMode();

    public static List<Ship> convertInputIntegersToShips(int[] counters) {
        List<Ship> ships = new ArrayList<>();
        for (int i = 0; i < counters.length; i++) {
            for (int j = 0; j < counters[i]; j++) {
                switch (i) {
                    case 0 -> ships.add(new Carrier());
                    case 1 -> ships.add(new Battleship());
                    case 2 -> ships.add(new Cruiser());
                    case 3 -> ships.add(new Destroyer());
                    case 4 -> ships.add(new Submarine());
                    default -> {
                    }
                }
            }
        }
        return ships;
    }
}
