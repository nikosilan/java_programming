
public class CarDriver {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota Corolla");
        myCar.fillTank();

        myCar.setTargetSpeed(80);

        System.out.println("Target speed: "
                + myCar.getTargetSpeed());

        if (myCar.turnOnCruiseControl()) {
            System.out.println("Cruise control is on");
        } else {
            System.out.println("Cruise control could not be turned on");
        }

        System.out.println("Current speed: "
                + myCar.getSpeed());

        myCar.turnOffCruiseControl();
        System.out.println("Cruise control is off");
    }
}
