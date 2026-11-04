public abstract class AbstractVehicle implements Vehicle {

    protected String type;

    public AbstractVehicle(String type) {
        this.type = type;
    }

    @Override
    public String getInfo() {
        return "This is a " + type + ".";
    }
}