package battleshipRMI.client.view.oceanview;

import battleshipRMI.shared.model.game.AttackReport;
import battleshipRMI.shared.model.game.ocean.Point;

import java.util.List;

public class OceanView {
    private final ShipCellView[][] oceanView;

    public OceanView(int horizontal, int vertical) {
        this.oceanView = new ShipCellView[vertical][horizontal];
    }

    public String updateOceanView(AttackReport report) {
        if (report == null || report.getPosition() == null) {
            return "";
        }
        Point p = report.getPosition();
        if (p.y() < 0 || p.y() >= oceanView.length || p.x() < 0 || p.x() >= oceanView[0].length) {
            return "Attacking position was out of the ocean.";
        }
        if (oceanView[p.y()][p.x()] == null) {
            oceanView[p.y()][p.x()] = new ShipCellView();
        }
        oceanView[p.y()][p.x()].shipWasAttackByUser(report);
        return "";
    }

    public String printOcean() {
        StringBuilder sb = new StringBuilder();
        for (ShipCellView[] row : oceanView) {
            for (ShipCellView cell : row) {
                sb.append(cell == null ? "   " : cell.toString());
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

    public void recoverShipCellsByPoints(List<Point> points) {
        if (points == null) {
            return;
        }
        for (Point p : points) {
            if (p.y() >= 0 && p.y() < oceanView.length && p.x() >= 0 && p.x() < oceanView[0].length) {
                oceanView[p.y()][p.x()] = null;
            }
        }
    }
}
