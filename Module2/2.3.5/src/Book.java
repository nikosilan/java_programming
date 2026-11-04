import java.util.ArrayList;

public class Book {

    private String title;
    private String author;
    private int publicationYear;
    private boolean isBorrowed;

    private double rating;
    private ArrayList<String> reviews;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isBorrowed = false;
        this.rating = 0.0;
        this.reviews = new ArrayList<>();
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

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public void addReview(String review) {
        reviews.add(review);
    }

    public void displayReviews() {
        System.out.println("Reviews for " + title + ":");

        for (String review : reviews) {
            System.out.println("- " + review);
        }
    }

    // TASK 5: Return the number of reviews

    public int getReviewCount() {
        return reviews.size();
    }
}