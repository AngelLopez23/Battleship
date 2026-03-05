package battleshipRMI.shared.model.ships;

public class Cruiser extends Ship {
    private static final int MAX_HEALTH = 3;

    public Cruiser() {
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
