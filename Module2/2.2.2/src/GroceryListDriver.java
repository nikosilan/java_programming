public class GroceryListDriver {
    public static void main(String[] args) {
        GroceryListManager myList = new GroceryListManager();

        // Add items with their costs
        myList.addItem("Milk", 2.50);
        myList.addItem("Bread", 1.80);
        myList.addItem("Apples", 3.20);

        // Display the grocery list
        myList.displayList();

        // Display the total cost
        System.out.println("Total cost: " +
                myList.calculateTotalCost());
    }
}
