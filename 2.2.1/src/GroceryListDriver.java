public class GroceryListDriver {
    public static void main(String[] args) {
        GroceryListManager myList = new GroceryListManager();

        // Add items to the list
        myList.addItem("Milk");
        myList.addItem("Bread");
        myList.addItem("Apples");

        // Display the list
        myList.displayList();

        // Check if an item is on the list
        if (myList.checkItem("Milk")) {
            System.out.println("Milk is on the list.");
        }

        // Remove an item
        myList.removeItem("Bread");

        System.out.println("\nAfter removing Bread:");
        myList.displayList();
    }
}
