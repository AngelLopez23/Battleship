package battleshipRMI.shared.model.game.user;

import battleshipRMI.shared.model.game.AttackReport;

public interface StatusChangedListener {
    void onStatusChanged(AttackReport report);
}
