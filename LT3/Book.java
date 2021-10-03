
public class Book {
    String isbn;
    String bookTitle;
    String authorName;
    double price;
    int availableQuantity;
    double discountRate;
    static int numberOfUniqueBooks;
    int bought;
    int sold;

    public Book() {
        System.out.println("empty");
    }

    public Book(String isbn, String bookTitle, String authorName, double discountRate, double price,
            int availableQuantity, int B, int S) {
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.discountRate = discountRate;
        this.price = price;
        this.availableQuantity = availableQuantity;
        bought = B;
        sold = S;
    }

    public void setisbn(String isbn) {
        this.isbn = isbn;
    }

    public void setbookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setauthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setdiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public void setprice(double price) {
        this.price = price;
    }

    public void setavailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public String getbookTitle() {
        return bookTitle;
    }

    public String getauthorName() {
        return authorName;
    }

    public double getdiscountRate(double discountRate) {
        return discountRate;
    }

    public double getprice() {

        return price;
    }

    public int getavailableQuantity() {
        return availableQuantity;
    }

    public String getisbn() {
        return isbn;
    }

    public void showdetails()
    {
        System.out.println("isbn: " + isbn);
        System.out.println("Book name: " + bookTitle);
        System.out.println("Author Name: " + authorName);
        System.out.println("Discount: " + discountRate);
        System.out.println("price: " + (price = price * discountRate));
        System.out.println("Number of books available: " + availableQuantity);
        availableQuantity = availableQuantity + bought;
        System.out.println("Number of books bought: " + availableQuantity);
        availableQuantity = availableQuantity + bought - sold;
        System.out.println("Number of books sold: " + availableQuantity);

    }
}