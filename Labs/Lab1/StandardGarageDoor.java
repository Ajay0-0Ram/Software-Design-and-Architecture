public class StandardGarageDoor implements GarageDoor {
    private final String id;

    public StandardGarageDoor(String id) {
        this.id = id;
    }

    @Override
    public void open() {
        System.out.println(id + ": Opening at fixed speed...");
    }

    @Override
    public void close() {
        System.out.println(id + ": Closing at fixed speed...");
    }
}