public class StoryBook extends Book {
    private String category;

    public StoryBook() {
        System.out.println("empty constructor");
    }

    public StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity,
            String category) {
        super(isbn, bookTitle, authorName, price, availableQuantity);
        this.category = category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }

    @Override
    public void showDetails() {
        System.out.println("StoryBook isbn: " + this.isbn);
        System.out.println("StoryBook Title : " + this.bookTitle);
        System.out.println("StoryBook Author Name: " + this.authorName);
        System.out.println("StoryBook price: " + this.price);
        System.out.println("StoryBook available Quantity: " + this.availableQuantity);
        System.out.println("StoryBook Category: " + this.category);
    }
}
