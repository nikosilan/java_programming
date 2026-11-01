public class GroceryListDriver {
    public static void main(String[] args) {
        GroceryListManager myList = new GroceryListManager();

        // Add items with costs and categories
        myList.addItem("Milk", 2.50, "Dairy");
        myList.addItem("Bread", 1.80, "Bakery");
        myList.addItem("Apples", 3.20, "Fruits");
        myList.addItem("Cheese", 4.50, "Dairy");

        // Display all items
        myList.displayList();

        System.out.println();

        // Display items in the Dairy category
        myList.displayByCategory("Dairy");

        // Display the total cost
        System.out.println("\nTotal cost: "
                + myList.calculateTotalCost());
    }
}
