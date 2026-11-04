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

        // Add books to library

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Display all books

        library.displayBooks();

        System.out.println();

        // Find books by author

        library.findBooksByAuthor("Jane Doe");

        System.out.println();

        // Borrowing and returning books

        library.borrowBook("Introduction to Java Programming");

        library.borrowBook("Introduction to Java Programming");

        library.returnBook("Introduction to Java Programming");

        library.borrowBook("Introduction to Java Programming");

        System.out.println();

        // Try to borrow a book that does not exist

        library.borrowBook("Unknown Book");
    }
}