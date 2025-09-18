public class GarageDoorAdapter implements GarageDoor {
    private final PremiumGarageDoor premiumGarageDoor;
    private final double speed;

    public GarageDoorAdapter(PremiumGarageDoor premiumGarageDoor, double speed) {
        this.premiumGarageDoor = premiumGarageDoor;
        this.speed = speed;
    }

    @Override
    public void open() {
        premiumGarageDoor.moveUp(speed);
    }

    @Override
    public void close() {
        premiumGarageDoor.moveDown(speed);
    }
}
