
public class Main {
    public static void main(String[] args) {

        Car car = new Car("Toyota", 50, 0);
        SportsCar sportsCar = new SportsCar("Ferrari", 70);

        car.fillTank();
        sportsCar.fillTank();

        System.out.println("Ordinary car:");
        System.out.println("Type: " + car.getTypeName());

        car.accelerate();
        System.out.println("Speed after acceleration: "
                + car.getSpeed() + " km/h");

        System.out.println("Fuel consumption: "
                + car.getFuelConsumption() + " l/100km");

        System.out.println();

        System.out.println("Sports car:");
        System.out.println("Type: " + sportsCar.getTypeName());

        sportsCar.accelerate();
        System.out.println("Speed after acceleration: "
                + sportsCar.getSpeed() + " km/h");

        System.out.println("Fuel consumption: "
                + sportsCar.getFuelConsumption() + " l/100km");

        sportsCar.decelerate(10);
        System.out.println("Speed after deceleration: "
                + sportsCar.getSpeed() + " km/h");
    }
}
