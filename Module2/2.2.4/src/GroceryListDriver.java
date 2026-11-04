
public class GroceryListDriver {
    public static void main(String[] args) {
        GroceryListManager myList = new GroceryListManager();

        // Add items with cost, category and quantity
        myList.addItem("Milk", 2.50, "Dairy", 2);
        myList.addItem("Bread", 1.80, "Bakery", 0);
        myList.addItem("Apples", 3.20, "Fruits", 5);
        myList.addItem("Cheese", 4.50, "Dairy", 1);

        // Update the quantity of Bread
        myList.updateQuantity("Bread", 3);

        // Display available items
        myList.displayAvailableItems();
    }
}
