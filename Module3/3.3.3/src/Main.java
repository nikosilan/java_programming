import model.Book;
import model.LibraryMember;
import system.Library;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        // Create books
        Book book1 = new Book("Harry Potter", "J.K. Rowling");
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien");
        Book book3 = new Book("1984", "George Orwell");

        // Create library members
        LibraryMember member1 = new LibraryMember("John", 101);
        LibraryMember member2 = new LibraryMember("Mary", 102);

        // Add books and members
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.addMember(member1);
        library.addMember(member2);

        // Reserve books
        library.reserveBook(book1, member1);
        library.reserveBook(book2, member2);

        System.out.println();

        // Display reserved books
        member1.displayReservedBooks();
        member2.displayReservedBooks();

        System.out.println();

        // Display book availability
        library.displayBooks();

        // Cancel a reservation
        library.cancelReservation(book1, member1);

        System.out.println();

        // Display updated book availability
        library.displayBooks();
    }
}