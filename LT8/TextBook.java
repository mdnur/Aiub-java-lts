public class TextBook extends Book {
    private int standard;

    public TextBook() {
        System.out.println("empty constructor");
    }

    public TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity,
            int standard) {
        super(isbn, bookTitle, authorName, price, availableQuantity);
        this.standard = standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public int getStandard() {
        return this.standard;
    }

    @Override
    public void showDetails() {
        System.out.println("TextBook isbn: " + this.isbn);
        System.out.println("TextBook Title : " + this.bookTitle);
        System.out.println("TextBook Author Name: " + this.authorName);
        System.out.println("TextBook price: " + this.price);
        System.out.println("TextBook available Quantity: " + this.availableQuantity);
        System.out.println("TextBook standard: " + this.standard);
    }
}
