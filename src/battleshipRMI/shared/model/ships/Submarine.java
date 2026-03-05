package battleshipRMI.shared.model.ships;

public class Submarine extends Ship {
    private static final int MAX_HEALTH = 1;

    public Submarine() {
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
