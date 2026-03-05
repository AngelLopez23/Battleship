package battleshipRMI.client.model;

import battleshipRMI.shared.model.game.AttackReport;
import battleshipRMI.shared.model.game.FiringMode;
import battleshipRMI.shared.model.game.ocean.Ocean;
import battleshipRMI.shared.model.game.ocean.Point;
import battleshipRMI.shared.model.game.user.UserMode;

import java.util.ArrayList;
import java.util.List;

public class UserClient {
    private String nickname;
    private UserMode mode;
    private Ocean board;
    private List<AttackReport> lastReports;

    public UserClient() {
        this.nickname = "";
        this.mode = UserMode.PLAYER;
        this.lastReports = new ArrayList<>();
    }

    public AttackReport hitOnPlace(Point position, FiringMode mode) {
        // TODO: This should be delegated to server-side game logic.
        return null;
    }

    public void receiveServerUpdate(AttackReport report) {
        lastReports.add(report);
    }
}
