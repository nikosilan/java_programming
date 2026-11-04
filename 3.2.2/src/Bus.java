public class Bus extends AbstractVehicle {

    public Bus() {
        super("bus");
    }

    @Override
    public void start() {
        System.out.println("Bus is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Bus is stopping.");
    }
}