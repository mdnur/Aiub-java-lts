import java.lang.*;

public class Book {

    private String isbn;
    private String bookTitle;
    private String authorName;
    private double price;
    private int availableQuantity;

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

    public String getIsbn() {
        return isbn;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public double getPrice() {
        return price;
    }

    public double getAvailableQuantity() {
        return availableQuantity;
    }

    public void addQuantity(int amount) {
        availableQuantity = availableQuantity + amount;
    }

    public void sellQuantity(int amount) {
        availableQuantity = availableQuantity - amount;
    }

    public void showDetails() {
        System.out.println("Isbn : " + isbn);
        System.out.println("Book Title :  " + bookTitle);
        System.out.println("Author Name :" + authorName);
        System.out.println("Price :" + price);
        System.out.println("Available Quantity :" + availableQuantity);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setIsbn("126835");
        b1.setBookTitle("The Theory Of Everything");
        b1.setAuthorName("Stephen William Hawking");
        b1.setPrice(730);
        b1.setAvailableQuantity(1300);
        b1.showDetails();
        b1.addQuantity(80);
        b1.showDetails();

        Book b2 = new Book();
        b2.setIsbn("16785");
        b2.setBookTitle("A Brief History of Time");
        b2.setAuthorName("Stephen William Hawking");
        b2.setPrice(460);
        b2.setAvailableQuantity(1600);
        b2.showDetails();
        b2.sellQuantity(70);
        b2.showDetails();
    }

}