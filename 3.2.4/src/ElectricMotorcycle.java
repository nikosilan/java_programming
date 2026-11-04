public class ElectricMotorcycle extends AbstractVehicle {

    public ElectricMotorcycle() {
        super("electric motorcycle", 0.08);
    }

    @Override
    public void start() {
        System.out.println("Electric motorcycle is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Electric motorcycle is stopping.");
    }

    @Override
    public void charge() {
        System.out.println("Electric motorcycle is charging.");
    }
}