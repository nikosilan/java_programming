
public class Car {
    private String typeName;
    private int speed;
    private boolean tankFull;
    private double tankCapacity;

    // Original constructor
    public Car(String typeName) {
        this.typeName = typeName;
        this.speed = 0;
        this.tankFull = false;
        this.tankCapacity = 0;
    }

    // New constructor
    public Car(String typeName, double tankCapacity, int speed) {
        this.typeName = typeName;
        this.tankCapacity = tankCapacity;
        this.speed = speed;
        this.tankFull = false;
    }

    public String getTypeName() {
        return typeName;
    }

    public int getSpeed() {
        return speed;
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
