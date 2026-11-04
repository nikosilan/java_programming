
public class Main {
    public static void main(String[] args) {

        Bus bus = new Bus("Volvo Bus", 200);

        System.out.println("Bus: " + bus.getTypeName());
        System.out.println("Passengers: " + bus.getPassengerCount());

        bus.passengerEnter();
        bus.passengerEnter();
        bus.passengerEnter();

        System.out.println("After passengers enter: "
                + bus.getPassengerCount());

        bus.passengerExit();

        System.out.println("After one passenger exits: "
                + bus.getPassengerCount());

        bus.passengerExit();
        bus.passengerExit();
        bus.passengerExit();

        System.out.println("After everyone exits: "
                + bus.getPassengerCount());
    }
}
