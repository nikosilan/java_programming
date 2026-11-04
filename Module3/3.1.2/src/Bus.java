
public class Bus extends Car {

    private int passengerCount;

    public Bus(String typeName, double tankCapacity) {
        super(typeName, tankCapacity, 0);
        passengerCount = 0;
    }

    public void passengerEnter() {
        passengerCount++;
    }

    public void passengerExit() {
        if (passengerCount > 0) {
            passengerCount--;
        }
    }

    public int getPassengerCount() {
        return passengerCount;
    }
}
