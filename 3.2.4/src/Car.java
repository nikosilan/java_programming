public class Car extends AbstractVehicle {

    public Car() {
        super("car", 30.0);
    }

    @Override
    public void start() {
        System.out.println("Car is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }
}