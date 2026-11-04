public class ElectricCar extends AbstractVehicle {

    public ElectricCar() {
        super("electric car", 0.18);
    }

    @Override
    public void start() {
        System.out.println("Electric car is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Electric car is stopping.");
    }

    @Override
    public void charge() {
        System.out.println("Electric car is charging.");
    }
}