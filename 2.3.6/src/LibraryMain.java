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

        // Add books to the library

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Display all books

        library.displayBooks();

        System.out.println();

        // Find books by author

        library.findBooksByAuthor("Jane Doe");

        System.out.println();

        // Borrowing books

        library.borrowBook("Introduction to Java Programming");
        library.borrowBook("Introduction to Java Programming");

        System.out.println();

        // Check book availability

        System.out.println("Book Availability:");

        System.out.println(
                "Introduction to Java Programming: "
                        + library.isBookAvailable(
                        "Introduction to Java Programming"
                )
        );

        System.out.println();

        // Return the book

        library.returnBook("Introduction to Java Programming");

        System.out.println();

        // Add ratings

        book1.setRating(4.5);
        book2.setRating(5.0);
        book3.setRating(3.5);

        // Add reviews

        book1.addReview("Very good book for learning Java!");
        book1.addReview("Easy to understand.");

        book2.addReview("Excellent explanations.");
        book2.addReview("Very useful for programming students.");

        book3.addReview("Interesting story.");

        // Display ratings

        System.out.println("Book Ratings:");

        System.out.println(
                book1.getTitle() + ": " + book1.getRating()
        );

        System.out.println(
                book2.getTitle() + ": " + book2.getRating()
        );

        System.out.println(
                book3.getTitle() + ": " + book3.getRating()
        );

        System.out.println();

        // Display reviews

        book1.displayReviews();

        System.out.println();

        book2.displayReviews();

        System.out.println();

        book3.displayReviews();

        System.out.println();

        // Library statistics

        System.out.println("Library Statistics:");

        System.out.println(
                "Average rating: " + library.getAverageRating()
        );

        Book mostReviewed = library.getMostReviewedBook();

        if (mostReviewed != null) {
            System.out.println(
                    "Most reviewed book: "
                            + mostReviewed.getTitle()
                            + " (" + mostReviewed.getReviewCount()
                            + " reviews)"
            );
        }

        System.out.println();

        // TASK 6: Create library users

        User user1 = new User("Matti");
        User user2 = new User("Liisa");

        // Add users to the library

        library.addUser(user1);
        library.addUser(user2);

        // Display library users

        library.displayUsers();

        System.out.println();

        // Users borrow books

        user1.borrowBook(book1);
        user1.borrowBook(book2);

        user2.borrowBook(book3);

        // Display borrowed books

        user1.displayBorrowedBooks();

        System.out.println();

        user2.displayBorrowedBooks();

        System.out.println();

        // User returns a book

        user1.returnBook(book1);

        System.out.println("After returning a book:");

        user1.displayBorrowedBooks();
    }
}