
public class CoffeeMaker {
    private boolean on = false;
    private String coffeeType = "normal";
    private int coffeeAmount = 10;

    // Check if the coffee maker is on
    public boolean isOn() {
        return on;
    }

    // Turn the coffee maker on or off
    public void pressOnOff() {
        on = !on;
    }

    // Get the coffee type
    public String getCoffeeType() {
        return coffeeType;
    }

    // Change the coffee type when the coffee maker is on
    public void setCoffeeType(String coffeeType) {
        if (on && (coffeeType.equals("normal") ||
                coffeeType.equals("espresso"))) {
            this.coffeeType = coffeeType;
        }
    }

    // Get the coffee amount
    public int getCoffeeAmount() {
        return coffeeAmount;
    }

    // Change the coffee amount when the coffee maker is on
    public void setCoffeeAmount(int coffeeAmount) {
        if (on && coffeeAmount >= 10 && coffeeAmount <= 80) {
            this.coffeeAmount = coffeeAmount;
        }
    }
}
