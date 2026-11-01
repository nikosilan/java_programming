import java.util.ArrayList;

public class GroceryListManager {

    private ArrayList<String> groceryList;

    // Create an empty grocery list
    public GroceryListManager() {
        groceryList = new ArrayList<>();
    }

    // Add an item to the grocery list
    public void addItem(String item) {
        groceryList.add(item);
    }

    // Remove an item from the grocery list
    public void removeItem(String item) {
        groceryList.remove(item);
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
}
