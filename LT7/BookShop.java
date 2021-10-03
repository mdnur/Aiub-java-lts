public class BookShop {
    private String name;
    private Book book[] = new Book[100];

    public BookShop() {
        System.out.println("empty constructor");
    }

    public BookShop(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean insertBook(Book b) {
        for (int i = 0; i < book.length; i++) {
            if (this.book[i] == null) {
                this.book[i] = b;
                return true;
            }
        }
        return false;
    }

    public boolean removeBook(Book b) {
        for (int i = 0; i < book.length; i++) {
            if (book[i] == null) {
                continue;
            }
            if (book[i] == b) {
                book[i] = null;
                return true;
            }
        }
        return false;
    }

    public Book searchBook(String isbn) {
        for (Book element : book) {
            if (element == null) {
                continue;
            }
            if (element.getIsbn() == isbn) {
                element.showDetails();
                return element;
            }
        }
        return null;

    }

    public void showAllBook() {
        for (Book element : book) {
            if (element != null) {
                element.showDetails();
                System.out.println();
            }
        }
    }
}
