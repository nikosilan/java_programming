public class Motorcycle extends AbstractVehicle {

    public Motorcycle() {
        super("motorcycle");
    }

    @Override
    public void start() {
        System.out.println("Motorcycle is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle is stopping.");
    }
}