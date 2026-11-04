
public class Car {
    private String typeName;
    private int speed;
    private boolean tankFull;
    private double tankCapacity;
    private double fuelConsumption;

    public Car(String typeName) {
        this(typeName, 0, 0);
    }

    public Car(String typeName, double tankCapacity, int speed) {
        this.typeName = typeName;
        this.speed = speed;
        this.tankFull = false;
        this.tankCapacity = tankCapacity;
        this.fuelConsumption = 7.0;
    }

    public String getTypeName() {
        return typeName;
    }

    public int getSpeed() {
        return speed;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public boolean isTankFull() {
        return tankFull;
    }

    public void fillTank() {
        tankFull = true;
    }

    public void accelerate() {
        if (tankFull) {
            speed += 15;
        }
    }

    public void decelerate(int amount) {
        speed -= amount;

        if (speed < 0) {
            speed = 0;
        }
    }
}
