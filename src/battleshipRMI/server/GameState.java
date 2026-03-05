package battleshipRMI.server;

import battleshipRMI.shared.model.game.AttackReport;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GameState implements Serializable {
    private int turn;
    private final List<String> activePlayers;
    private final List<AttackReport> shotResults;

    public GameState() {
        this.turn = 0;
        this.activePlayers = new ArrayList<>();
        this.shotResults = new ArrayList<>();
    }
}
