import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    // TASK 6: Add a user to the library

    public void addUser(User user) {
        users.add(user);
    }

    // TASK 6: Display all users

    public void displayUsers() {

        System.out.println("Library Users:");

        for (User user : users) {
            System.out.println("- " + user.getName());
        }
    }

    public void displayBooks() {
        System.out.println("Library Catalog:");

        for (Book book : books) {
            System.out.println(
                    "Title: " + book.getTitle()
                            + ", Author: " + book.getAuthor()
                            + ", Year: " + book.getPublicationYear()
            );
        }
    }

    public void findBooksByAuthor(String author) {

        System.out.println("Books by Author: " + author);

        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(
                        "Title: " + book.getTitle()
                                + ", Year: " + book.getPublicationYear()
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

    public Book getMostReviewedBook() {

        if (books.isEmpty()) {
            return null;
        }

        Book mostReviewedBook = books.get(0);

        for (Book book : books) {
            if (book.getReviewCount()
                    > mostReviewedBook.getReviewCount()) {

                mostReviewedBook = book;
            }
        }

        return mostReviewedBook;
    }
}