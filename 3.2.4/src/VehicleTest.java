public class VehicleTest {

    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        Vehicle bus = new Bus();

        Vehicle electricCar = new ElectricCar();
        Vehicle electricMotorcycle = new ElectricMotorcycle();

        System.out.println(car.getInfo());
        car.start();
        car.stop();
        System.out.println("Fuel efficiency: "
                + car.calculateFuelEfficiency() + " MPG");

        System.out.println();

        System.out.println(motorcycle.getInfo());
        motorcycle.start();
        motorcycle.stop();
        System.out.println("Fuel efficiency: "
                + motorcycle.calculateFuelEfficiency() + " MPG");

        System.out.println();

        System.out.println(bus.getInfo());
        bus.start();
        bus.stop();
        System.out.println("Fuel efficiency: "
                + bus.calculateFuelEfficiency() + " MPG");

        System.out.println();

        System.out.println("Electric vehicles:");

        electricCar.start();
        System.out.println("Energy consumption: "
                + electricCar.calculateFuelEfficiency() + " kWh/km");
        ((ElectricVehicle) electricCar).charge();

        System.out.println();

        electricMotorcycle.start();
        System.out.println("Energy consumption: "
                + electricMotorcycle.calculateFuelEfficiency() + " kWh/km");
        ((ElectricVehicle) electricMotorcycle).charge();
    }
}