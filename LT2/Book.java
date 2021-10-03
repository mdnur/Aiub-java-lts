public class Book {
    private String isbn;
    private String bookTitle;
    private String authorName;
    private double price;
    private int availableQuantity;

    public Book() {
        System.out.println("empty constructor");
    }

    public Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity) {
        System.out.println("parameters constructor");
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

    public void setAvaiableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public double getPrice() {
        return this.price;
    }

    public int getAvailableQuantity() {
        return this.availableQuantity;
    }

    public void addQuantity(int amount) {
        System.out.println("Adding Quantity");
        this.availableQuantity += amount;
    }

    public void sellQuantity(int amount) {
        if (this.availableQuantity < amount ){
            System.out.println("Don't have sufficient book Quantity");
            return;
        }
        System.out.println("Selling Quantity");
        this.availableQuantity -= amount;
    }

    public void showDetails() {
        System.out.println("Book isbn: " + isbn);
        System.out.println("Book Title : " + bookTitle);
        System.out.println("Book Author Name: " + authorName);
        System.out.println("Book price: " + price);
        System.out.println("Book available Quantity: " + availableQuantity);
    }
}
