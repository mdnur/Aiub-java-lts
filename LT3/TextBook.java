public class TextBook {
    private String isbn;
    private String bookTitle;
    private String authorName;
    private double price;
    private int availableQuantity;
    private int standard;
    private static double discountRate;


    public TextBook() {
        System.out.println("empty constructor");
    }

    public TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity,
            int standard) {
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.price = price;
        this.availableQuantity = availableQuantity;
        this.standard = standard;
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

    public void setStandard(int standard) {
        this.standard = standard;
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

    public int getStandard() {
        return this.standard;
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
        System.out.println("TextBook isbn: " + this.isbn);
        System.out.println("TextBook Title : " + this.bookTitle);
        System.out.println("TextBook Author Name: " + this.authorName);
        System.out.println("TextBook price: " + this.price);
        System.out.println("TextBook available Quantity: " + this.availableQuantity);
        System.out.println("TextBook standard: " + this.standard);
        System.out.println("TextBook Discount Rate: " + discountRate);
    }
}
