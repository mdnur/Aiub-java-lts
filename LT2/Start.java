public class Start {
    public static void main(String[] args){
        Book book1 = new Book("0136083250","Clean Code","Robert C. Martin",30.50,20);
        book1.showDetails();
        System.out.println();
        System.out.println("After selling book");
        book1.sellQuantity(5);
        book1.showDetails();
        book1.bookTitle =5;
        System.out.println();

        Book book2 = new Book();
        book2.setIsbn("0134686047");
        book2.setBookTitle("Effective Java");
        book2.setAuthorName("Joshua Bloch");
        book2.setPrice(60.75);
        book2.setAvaiableQuantity(30);
        book2.showDetails();
        
        book2.addQuantity(20);
        System.out.println("Total Quantity is : " + book2.getAvailableQuantity());
    }
}
