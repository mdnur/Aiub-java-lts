
public abstract class Book implements BookOperations{
    protected String isbn;
    protected String bookTitle;
    protected String authorName;
    protected double price;
    protected int availableQuantity;

    public Book() {
        System.out.println("empty");
    }

    public Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity) {
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

    @Override
    public void addQuantity(int amount) {
        this.availableQuantity += amount;
    }

    @Override
    public void sellQuantity(int amount) {
        if (this.availableQuantity < amount) {
            System.out.println("Don't have sufficient book Quantity");
            return;
        }
        System.out.println("Selling Quantity");
        this.availableQuantity -= amount;
    }

    public abstract void showDetails();
}