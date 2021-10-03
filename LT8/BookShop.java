public class BookShop implements BookShopOperations{
    private String name;
    private Book[] listOfBooks = new Book[100];

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

    @Override
    public boolean insertBook(Book b) {
        for (int i = 0; i < listOfBooks.length; i++) {
            if (this.listOfBooks[i] == null) {
                this.listOfBooks[i] = b;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removeBook(Book b) {
        for (int i = 0; i < listOfBooks.length; i++) {
            if (listOfBooks[i] == null) {
                continue;
            }
            if (listOfBooks[i] == b) {
                listOfBooks[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Book searchBook(String isbn) {
        for (Book element : listOfBooks) {
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

    @Override
    public void showAllBooks() {
        for (Book element : listOfBooks) {
            if (element != null) {
                element.showDetails();
                System.out.println();
            }
        }
    }

   
}
