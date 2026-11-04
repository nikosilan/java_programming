import java.util.ArrayList;
import java.util.HashMap;

public class GroceryListManager {

    private ArrayList<String> groceryList;
    private HashMap<String, Double> itemCosts;

    // Create an empty grocery list
    public GroceryListManager() {
        groceryList = new ArrayList<>();
        itemCosts = new HashMap<>();
    }

    // Add an item without a cost
    public void addItem(String item) {
        groceryList.add(item);
    }

    // Add an item with a cost
    public void addItem(String item, double cost) {
        groceryList.add(item);
        itemCosts.put(item, cost);
    }

    // Remove an item from the grocery list
    public void removeItem(String item) {
        groceryList.remove(item);
        itemCosts.remove(item);
    }

    // Display all items on the grocery list
    public void displayList() {
        System.out.println("Grocery list:");

        for (String item : groceryList) {
            if (itemCosts.containsKey(item)) {
                System.out.println(item + ": " + itemCosts.get(item));
            } else {
                System.out.println(item);
            }
        }
    }

    // Check if an item is on the grocery list
    public boolean checkItem(String item) {
        return groceryList.contains(item);
    }

    // Calculate the total cost of all items
    public double calculateTotalCost() {
        double total = 0;

        for (double cost : itemCosts.values()) {
            total += cost;
        }

        return total;
    }
}
