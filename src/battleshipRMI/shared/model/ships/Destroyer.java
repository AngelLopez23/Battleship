package battleshipRMI.shared.model.ships;

public class Destroyer extends Ship {
    private static final int MAX_HEALTH = 2;

    public Destroyer() {
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
