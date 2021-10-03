public class Start {
    public static void main(String[] args){
        //setting discount Rate
        StoryBook.setDiscountRate(10);
        
        System.out.println("--StoryBook--");
        StoryBook book1 = new StoryBook("013867183250","Laravel secrets","Robert C. Martin",30.50,20,"programming");
        book1.showDetails();
        System.out.println();
        System.out.println("After selling book");
        book1.sellQuantity(5);
        book1.showDetails();
        System.out.println();

        StoryBook book2 = new StoryBook();
        book2.setIsbn("0134686047");
        book2.setBookTitle("Effective Java");
        book2.setAuthorName("Joshua Bloch");
        book2.setPrice(60.75);
        book2.setAvaiableQuantity(30);
        book2.setCategory("programming");
        book2.showDetails();

        book2.addQuantity(20);
        System.out.println("Total Quantity is : " + book2.getAvailableQuantity());

        System.out.println("--TextBook--");

        //TextBook   

        TextBook book3 = new TextBook("0136083250","Clean Code","Robert C. Martin",30.50,20,0134);
        book3.showDetails();
        System.out.println();
        System.out.println("After selling book");
        book3.sellQuantity(5);
        book3.showDetails();
        System.out.println();

        TextBook book4 = new TextBook();
        book4.setIsbn("0134686047");
        book4.setBookTitle("Effective Java");
        book4.setAuthorName("Joshua Bloch");
        book4.setPrice(60.75);
        book4.setAvaiableQuantity(50);
        book4.setStandard(01346);
        book4.showDetails();

        book4.addQuantity(20);
        System.out.println("Total Quantity is : " + book4.getAvailableQuantity());
    }
}
