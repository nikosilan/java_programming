public class VehicleTest {

    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        Vehicle bus = new Bus();

        System.out.println(car.getInfo());
        car.start();
        car.stop();

        System.out.println();

        System.out.println(motorcycle.getInfo());
        motorcycle.start();
        motorcycle.stop();

        System.out.println();

        System.out.println(bus.getInfo());
        bus.start();
        bus.stop();
    }
}