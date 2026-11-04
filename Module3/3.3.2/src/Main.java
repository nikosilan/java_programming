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

        // Add books and members to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.addMember(member1);
        library.addMember(member2);

        // Display library information
        library.displayBooks();
        library.displayMembers();
    }
}