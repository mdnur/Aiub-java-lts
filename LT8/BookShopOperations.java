
public interface BookShopOperations {

    public boolean insertBook(Book b);

    public boolean removeBook(Book b);

    public void showAllBooks();

    public Book searchBook(String isbn);
}
