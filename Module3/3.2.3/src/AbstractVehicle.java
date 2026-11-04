public abstract class AbstractVehicle implements Vehicle, ElectricVehicle {

    protected String type;

    public AbstractVehicle(String type) {
        this.type = type;
    }

    @Override
    public String getInfo() {
        return "This is a " + type + ".";
    }

    @Override
    public void charge() {
        System.out.println(type + " cannot be charged.");
    }
}