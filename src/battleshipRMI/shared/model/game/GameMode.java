package battleshipRMI.shared.model.game;

import java.util.EnumSet;

public enum GameMode {
    NO_OPTIONS,
    TORPEDO_MODE_ENABLE,
    SHIP_RECOVERY_MODE_ENABLE;

    public static final EnumSet<GameMode> ALL_OPTIONS = EnumSet.allOf(GameMode.class);
}
