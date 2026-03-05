package battleshipRMI.client.view.oceanview;

import battleshipRMI.shared.model.game.AttackReport;

public class ShipCellView {
    private boolean wasHit;
    private boolean isSunk;

    public void shipWasAttackByUser(AttackReport result) {
        if (result.getResult() != AttackReport.HitResult.MISS) {
            wasHit = true;
        }
        if (result.getResult() == AttackReport.HitResult.SUNK) {
            isSunk = true;
        }
    }

    @Override
    public String toString() {
        if (isSunk) {
            return " x ";
        }
        if (wasHit) {
            return " * ";
        }
        return " . ";
    }
}
