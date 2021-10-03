import java.util.*;

public class Book {
    String isbn;
    String bookTitle;
    String authorName;
    double price;
    int availableQuantity;

    public Book() {
        System.out.println("empty");
    }

    public Book(String isbn, String bookTitle, String authorName, int availableQuantity, double price) {
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public double getPrice() {

        return this.price;
    }

    public int getAvailableQuantity() {
        return this.availableQuantity;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void showDetails() {
        System.out.println("isbn: " + this.isbn);
        System.out.println("Book name: " + this.bookTitle);
        System.out.println("Author Name: " + this.authorName);
        System.out.println("Price Name: " + this.price);
        System.out.println("Number of books available: " + this.availableQuantity);
    }
}