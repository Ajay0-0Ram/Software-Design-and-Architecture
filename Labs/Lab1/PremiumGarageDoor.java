public class PremiumGarageDoor {
    private final String id;

    public PremiumGarageDoor(String id) {
        this.id = id;
    }

    public void moveUp(double speed) {
        System.out.println(id + ": Moving UP at speed " + speed);
    }

    public void moveDown(double speed) {
        System.out.println(id + ": Moving DOWN at speed " + speed);
    }
}