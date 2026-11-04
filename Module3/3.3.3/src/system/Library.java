package system;

import model.Book;
import model.LibraryMember;
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private ArrayList<LibraryMember> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(LibraryMember member) {
        members.add(member);
    }

    public void reserveBook(Book book, LibraryMember member) {
        if (books.contains(book) && book.isAvailable()) {
            book.setAvailable(false);
            member.reserveBook(book);
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    public void cancelReservation(Book book, LibraryMember member) {
        if (member.getReservedBooks().contains(book)) {
            member.cancelReservation(book);
            book.setAvailable(true);
            System.out.println("Reservation cancelled successfully.");
        } else {
            System.out.println("Reservation not found.");
        }
    }

    public void displayBooks() {
        System.out.println("Library books:");

        for (Book book : books) {
            book.displayInfo();
            System.out.println();
        }
    }

    public void displayMembers() {
        System.out.println("Library members:");

        for (LibraryMember member : members) {
            member.displayInfo();
            System.out.println();
        }
    }
}