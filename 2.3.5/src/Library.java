import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Library Catalog:");

        for (Book book : books) {
            System.out.println(
                    "Title: " + book.getTitle() +
                            ", Author: " + book.getAuthor() +
                            ", Year: " + book.getPublicationYear()
            );
        }
    }

    public void findBooksByAuthor(String author) {

        System.out.println("Books by Author: " + author);

        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(
                        "Title: " + book.getTitle() +
                                ", Year: " + book.getPublicationYear()
                );
            }
        }
    }

    public void borrowBook(String title) {

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {

                if (book.borrowBook()) {
                    System.out.println("Book borrowed successfully!");
                } else {
                    System.out.println("Book is already borrowed.");
                }

                return;
            }
        }

        System.out.println("Book not found.");
    }

    public void returnBook(String title) {

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {

                if (book.isBorrowed()) {
                    book.returnBook();
                    System.out.println("Book returned successfully!");
                } else {
                    System.out.println("Book is not borrowed.");
                }

                return;
            }
        }

        System.out.println("Book not found.");
    }

    public boolean isBookAvailable(String title) {

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return !book.isBorrowed();
            }
        }

        return false;
    }

    // TASK 5: Calculate average rating

    public double getAverageRating() {

        if (books.isEmpty()) {
            return 0.0;
        }

        double totalRating = 0;

        for (Book book : books) {
            totalRating += book.getRating();
        }

        return totalRating / books.size();
    }

    // TASK 5: Find the book with the most reviews

    public Book getMostReviewedBook() {

        if (books.isEmpty()) {
            return null;
        }

        Book mostReviewedBook = books.get(0);

        for (Book book : books) {

            if (book.getReviewCount() >
                    mostReviewedBook.getReviewCount()) {

                mostReviewedBook = book;
            }
        }

        return mostReviewedBook;
    }
}