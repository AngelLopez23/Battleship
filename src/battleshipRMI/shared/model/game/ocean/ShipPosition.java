package battleshipRMI.shared.model.game.ocean;

import battleshipRMI.shared.model.ships.Ship;

import java.io.Serializable;
import java.util.Random;

public class ShipPosition implements Serializable {
    public enum Direction {
        UP, DOWN, LEFT, RIGHT
    }

    private final Point position;
    private final Direction direction;

    public ShipPosition(Point position, Direction direction) {
        this.position = position;
        this.direction = direction;
    }

    public Point getPosition() {
        return position;
    }

    public Direction getDirection() {
        return direction;
    }

    public static ShipPosition getRandomShipPosition(Ocean ocean, Ship ship) {
        Random random = new Random();
        Point point = new Point(random.nextInt(Math.max(1, ocean.getSizeHorizontal())), random.nextInt(Math.max(1, ocean.getSizeVertical())));
        Direction[] values = Direction.values();
        Direction dir = values[random.nextInt(values.length)];
        return new ShipPosition(point, dir);
    }
}
