package battleshipRMI.shared.model.game.ocean;

import battleshipRMI.shared.model.ships.Ship;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Ocean implements Serializable {
    private final int sizeHorizontal;
    private final int sizeVertical;
    private final Ship[][] ocean;

    public Ocean(int sizeHorizontal, int sizeVertical) {
        this.sizeHorizontal = sizeHorizontal;
        this.sizeVertical = sizeVertical;
        this.ocean = new Ship[sizeVertical][sizeHorizontal];
    }

    public int getSizeHorizontal() {
        return sizeHorizontal;
    }

    public int getSizeVertical() {
        return sizeVertical;
    }

    public static Ocean randomPlace(List<Ship> ships, Ocean ocean) {
        // TODO: Place ships randomly respecting adjacency rules.
        return ocean;
    }

    public ShipPosition tryPlaceShip(Ship ship, ShipPosition pos) {
        // TODO: Validate and place ship in matrix.
        return pos;
    }

    public Ship getShipByPosition(Point pos) {
        if (pos.x() < 0 || pos.y() < 0 || pos.y() >= sizeVertical || pos.x() >= sizeHorizontal) {
            return null;
        }
        return ocean[pos.y()][pos.x()];
    }

    public List<Point> getPointsOccupiedByShip(Ship ship) {
        List<Point> points = new ArrayList<>();
        for (int y = 0; y < sizeVertical; y++) {
            for (int x = 0; x < sizeHorizontal; x++) {
                if (ship != null && ship.equals(ocean[y][x])) {
                    points.add(new Point(x, y));
                }
            }
        }
        return points;
    }
}
