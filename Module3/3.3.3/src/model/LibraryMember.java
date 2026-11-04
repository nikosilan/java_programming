package model;

import java.util.ArrayList;

public class LibraryMember {

    private String name;
    private int memberId;
    private ArrayList<Book> reservedBooks;

    public LibraryMember(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
        reservedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    public ArrayList<Book> getReservedBooks() {
        return reservedBooks;
    }

    public void reserveBook(Book book) {
        reservedBooks.add(book);
    }

    public void cancelReservation(Book book) {
        reservedBooks.remove(book);
    }

    public void displayReservedBooks() {
        System.out.println("Reserved books for " + name + ":");

        for (Book book : reservedBooks) {
            System.out.println(book.getTitle());
        }
    }

    public void displayInfo() {
        System.out.println("Member name: " + name);
        System.out.println("Member ID: " + memberId);
    }
}