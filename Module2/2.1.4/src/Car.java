
public class Car {
    private String typeName;
    private int speed;
    private boolean tankFull;
    private double tankCapacity;

    private int targetSpeed;
    private boolean cruiseControlOn;

    private final int MIN_SPEED = 30;
    private final int MAX_SPEED = 120;

    public Car(String typeName) {
        this.typeName = typeName;
        this.speed = 0;
        this.tankFull = false;
        this.tankCapacity = 0;
        this.targetSpeed = 0;
        this.cruiseControlOn = false;
    }

    public Car(String typeName, double tankCapacity, int speed) {
        this.typeName = typeName;
        this.tankCapacity = tankCapacity;
        this.speed = speed;
        this.tankFull = false;
        this.targetSpeed = 0;
        this.cruiseControlOn = false;
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

    public void setTargetSpeed(int targetSpeed) {
        this.targetSpeed = targetSpeed;
    }

    public int getTargetSpeed() {
        return targetSpeed;
    }

    public boolean turnOnCruiseControl() {
        if (!tankFull || targetSpeed < MIN_SPEED
                || targetSpeed > MAX_SPEED) {
            cruiseControlOn = false;
            return false;
        }

        cruiseControlOn = true;

        while (speed < targetSpeed) {
            speed += 1;
        }

        while (speed > targetSpeed) {
            speed -= 1;
        }

        return true;
    }

    public void turnOffCruiseControl() {
        cruiseControlOn = false;
    }

    public boolean isCruiseControlOn() {
        return cruiseControlOn;
    }
}
