public abstract class AbstractVehicle implements Vehicle, ElectricVehicle {

    protected String type;
    protected double fuelEfficiency;

    public AbstractVehicle(String type, double fuelEfficiency) {
        this.type = type;
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public String getInfo() {
        return "This is a " + type + ".";
    }

    @Override
    public void charge() {
        System.out.println(type + " cannot be charged.");
    }

    @Override
    public double calculateFuelEfficiency() {
        return fuelEfficiency;
    }
}