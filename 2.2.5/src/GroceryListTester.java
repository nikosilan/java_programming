public class GroceryListTester {
    public static void main(String[] args) {

        GroceryListManager myList = new GroceryListManager();

        // Add items to the grocery list
        myList.addItem("Milk", 2.50, "Dairy", 2);
        myList.addItem("Bread", 1.80, "Bakery", 1);
        myList.addItem("Apples", 3.20, "Fruits", 5);

        // Display the grocery list
        myList.displayList();

        // Check if an item exists
        System.out.println("Is Milk on the list? "
                + myList.checkItem("Milk"));

        // Calculate the total cost
        System.out.println("Total cost: "
                + myList.calculateTotalCost());

        // Display items by category
        myList.displayByCategory("Dairy");

        // Update an item's quantity
        myList.updateQuantity("Milk", 4);

        // Display available items
        myList.displayAvailableItems();

        // Remove an item
        myList.removeItem("Bread");

        // Display the updated list
        myList.displayList();
    }
}