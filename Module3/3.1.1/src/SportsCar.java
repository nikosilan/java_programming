
public class SportsCar extends Car {

    public SportsCar(String typeName, double tankCapacity) {
        super(typeName, tankCapacity, 0);
    }

    @Override
    public void accelerate() {
        if (isTankFull()) {
            super.accelerate();
            super.accelerate();
        }
    }

    @Override
    public void decelerate(int amount) {
        super.decelerate(amount * 2);
    }

    @Override
    public double getFuelConsumption() {
        return 12.0;
    }
}
