public class Book {

    private String title;
    private String author;
    private int publicationYear;
    private boolean isBorrowed;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
            return true;
        }
        return false;
    }

    public void returnBook() {
        isBorrowed = false;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }
}