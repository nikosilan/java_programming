public class VehicleTest {

    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        Vehicle bus = new Bus();

        ElectricVehicle electricCar = new ElectricCar();
        ElectricVehicle electricMotorcycle = new ElectricMotorcycle();

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

        System.out.println();

        System.out.println("Electric vehicles:");

        electricCar.charge();
        electricMotorcycle.charge();
    }
}