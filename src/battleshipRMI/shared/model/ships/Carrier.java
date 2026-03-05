package battleshipRMI.shared.model.ships;

public class Carrier extends Ship {
    private static final int MAX_HEALTH = 5;

    public Carrier() {
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
