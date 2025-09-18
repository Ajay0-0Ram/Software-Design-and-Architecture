public class TestGarageDoor {
    public static void main(String[] args) {
        GarageDoor standard = new StandardGarageDoor("Blue");

        standard.open();
        standard.close();

        PremiumGarageDoor premium = new PremiumGarageDoor("Red");

        double speed = 4;
        GarageDoor premiumDoor = new GarageDoorAdapter(premium, speed);

        premiumDoor.open();
        premiumDoor.close();
    }
}
