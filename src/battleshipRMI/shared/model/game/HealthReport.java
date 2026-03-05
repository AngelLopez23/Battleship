package battleshipRMI.shared.model.game;

import java.io.Serializable;

public record HealthReport(int healthRemaining, int scoreByHit) implements Serializable {
}
