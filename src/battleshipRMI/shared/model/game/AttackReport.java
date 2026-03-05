package battleshipRMI.shared.model.game;

import battleshipRMI.shared.model.game.ocean.Point;
import battleshipRMI.shared.model.ships.Ship;

import java.io.Serializable;
import java.util.List;

public class AttackReport implements Serializable {
    public enum HitResult {
        MISS, HIT, SUNK
    }

    private final Ship ship;
    private final HitResult result;
    private final Point position;
    private final int fleetHealthRemaining;
    private final List<Point> pointsOccupiedByShip;

    public AttackReport(Ship ship, HitResult result, Point position, int fleetHealthRemaining, List<Point> pointsOccupiedByShip) {
        this.ship = ship;
        this.result = result;
        this.position = position;
        this.fleetHealthRemaining = fleetHealthRemaining;
        this.pointsOccupiedByShip = pointsOccupiedByShip;
    }

    public Ship getShip() {
        return ship;
    }

    public HitResult getResult() {
        return result;
    }

    public Point getPosition() {
        return position;
    }

    public int getFleetHealthRemaining() {
        return fleetHealthRemaining;
    }

    public List<Point> getPointsOccupiedByShip() {
        return pointsOccupiedByShip;
    }
}
