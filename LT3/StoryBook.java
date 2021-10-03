public class StoryBook {
    private String isbn;
    private String bookTitle;
    private String authorName;
    private double price;
    private int availableQuantity;
    private String category;
    private static double discountRate;

    public StoryBook() {
        System.out.println("empty constructor");
    }

    public StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity,
            String category) {
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.price = price;
        this.availableQuantity = availableQuantity;
        this.category = category;
    }

    public static void setDiscountRate(double rate) {
        discountRate = rate;
    }

    public static double getDiscountRate() {
        return discountRate;
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

    public void setCategory(String category) {
        this.category = category;
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

    public String getCategory() {
        return this.category;
    }

    public void addQuantity(int amount) {
        this.availableQuantity += amount;
    }

    public void sellQuantity(int amount) {
        if (this.availableQuantity < amount) {
            System.out.println("Don't have sufficient book Quantity");
            return;
        }
        System.out.println("Selling Quantity");
        this.availableQuantity -= amount;
    }

    public void showDetails() {
        System.out.println("StoryBook isbn: " + this.isbn);
        System.out.println("StoryBook Title : " + this.bookTitle);
        System.out.println("StoryBook Author Name: " + this.authorName);
        System.out.println("StoryBook price: " + this.price);
        System.out.println("StoryBook available Quantity: " + this.availableQuantity);
        System.out.println("StoryBook Category: " + this.category);
        System.out.println("StoryBook discount Rate: " + discountRate);
    }
}
