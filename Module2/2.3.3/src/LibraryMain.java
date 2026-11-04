public class LibraryMain {

    public static void main(String[] args) {

        // Create books

        Book book1 = new Book(
                "Introduction to Java Programming",
                "John Smith",
                2020
        );

        Book book2 = new Book(
                "Data Structures and Algorithms",
                "Jane Doe",
                2018
        );

        Book book3 = new Book(
                "The Art of Fiction",
                "Alice Johnson",
                2019
        );

        // Create library

        Library library = new Library();

        // Add books

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Display books

        library.displayBooks();

        System.out.println();

        // Find books by author

        library.findBooksByAuthor("Jane Doe");

        System.out.println();

        // Borrowing books

        library.borrowBook("Introduction to Java Programming");

        library.borrowBook("Introduction to Java Programming");

        System.out.println();

        // Task 3: Check availability

        System.out.println("Book Availability:");

        System.out.println(
                "Introduction to Java Programming: " +
                        library.isBookAvailable("Introduction to Java Programming")
        );

        System.out.println(
                "Data Structures and Algorithms: " +
                        library.isBookAvailable("Data Structures and Algorithms")
        );

        System.out.println(
                "Unknown Book: " +
                        library.isBookAvailable("Unknown Book")
        );

        System.out.println();

        // Return book

        library.returnBook("Introduction to Java Programming");

        System.out.println();

        // Check availability again

        System.out.println(
                "Introduction to Java Programming: " +
                        library.isBookAvailable("Introduction to Java Programming")
        );
    }
}