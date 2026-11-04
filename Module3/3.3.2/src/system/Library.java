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