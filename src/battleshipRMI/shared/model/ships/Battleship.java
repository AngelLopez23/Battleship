package battleshipRMI.shared.model.ships;

public class Battleship extends Ship {
    private static final int MAX_HEALTH = 4;

    public Battleship() {
        super(MAX_HEALTH);
    }

    @Override
    public int getLength() {
        return MAX_HEALTH;
    }

    @Override
    public void restoreHealthInRecoveryMode() {
        health = MAX_HEALTH;
    }
}
