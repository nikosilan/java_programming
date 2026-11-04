
import java.util.ArrayList;
import java.util.HashMap;

public class GroceryListManager {

    private ArrayList<String> groceryList;
    private HashMap<String, Double> itemCosts;
    private HashMap<String, String> itemCategories;
    private HashMap<String, Integer> itemQuantities;

    // Create an empty grocery list
    public GroceryListManager() {
        groceryList = new ArrayList<>();
        itemCosts = new HashMap<>();
        itemCategories = new HashMap<>();
        itemQuantities = new HashMap<>();
    }

    // Add an item without cost or category
    public void addItem(String item) {
        groceryList.add(item);
    }

    // Add an item with a cost
    public void addItem(String item, double cost) {
        addItem(item);
        itemCosts.put(item, cost);
    }

    // Add an item with a cost and category
    public void addItem(String item, double cost, String category) {
        addItem(item, cost);
        itemCategories.put(item, category);
    }

    // Add an item with cost, category and quantity
    public void addItem(String item, double cost,
                        String category, int quantity) {
        addItem(item, cost, category);
        itemQuantities.put(item, quantity);
    }

    // Remove an item from the grocery list
    public void removeItem(String item) {
        groceryList.remove(item);
        itemCosts.remove(item);
        itemCategories.remove(item);
        itemQuantities.remove(item);
    }

    // Display all items on the grocery list
    public void displayList() {
        System.out.println("Grocery list:");

        for (String item : groceryList) {
            System.out.println(item);
        }
    }

    // Check if an item is on the grocery list
    public boolean checkItem(String item) {
        return groceryList.contains(item);
    }

    // Calculate the total cost
    public double calculateTotalCost() {
        double total = 0;

        for (double cost : itemCosts.values()) {
            total += cost;
        }

        return total;
    }

    // Display items in a specific category
    public void displayByCategory(String category) {
        System.out.println("Category: " + category);

        for (String item : groceryList) {
            if (itemCategories.containsKey(item)
                    && itemCategories.get(item).equals(category)) {
                System.out.println(item);
            }
        }
    }

    // Update the quantity of an item
    public void updateQuantity(String item, int newQuantity) {
        if (itemQuantities.containsKey(item)) {
            itemQuantities.put(item, newQuantity);
        }
    }

    // Display items that are available
    public void displayAvailableItems() {
        System.out.println("Available items:");

        for (String item : groceryList) {
            if (itemQuantities.containsKey(item)
                    && itemQuantities.get(item) > 0) {
                System.out.println(item + ": "
                        + itemQuantities.get(item));
            }
        }
    }
}
