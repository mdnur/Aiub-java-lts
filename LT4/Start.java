public class Start {
    public static void main(String[] args) {
        Book[] book = new Book[5];

        Book b0 = new Book("0135166306", "Core Java Volume I--Fundamentals", "Cay S. Horstmann", 10, 50);
        Book b1 = new Book("1593275994", "Automate the Boring Stuff with Python", "Al Sweigart", 15, 56);
        Book b2 = new Book("0134686047", "Effective Java", "Joshua Bloch", 20, 59);
        Book b3 = new Book("1593275994", "Clean Code", "Robert C. Martin", 30, 100);
        Book b4 = new Book("0135166306", "Laravel secrets", "Robert C. Martin", 5, 20);

        book[0] = b0;
        book[1] = b1;
        book[2] = b2;
        book[3] = b3;
        book[4] = b4;

        for (int i = 0; i < book.length; i++) {
            if (book[i] != null) {
                System.out.println("------------------");
                System.out.println("Book[" + i + "] isbn: " + book[i].getIsbn());
                System.out.println("Book[" + i + "] Book Title: " + book[i].getBookTitle());
                System.out.println("Book[" + i + "] Author Name: " + book[i].getAuthorName());
                System.out.println("Book[" + i + "] price: " + book[i].getPrice());
                System.out.println("Book[" + i + "] AvailableQuantity: " + book[i].getAvailableQuantity());
                System.out.println();
            } else {
                System.out.println("------------------");
                System.out.println("There is No Object in Book[" + i + "]");
            }
        }
    }
}
