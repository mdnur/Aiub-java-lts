public class Start {
    public static void main(String[] args) {
        System.out.println("----Book 1----");
        TextBook book1 = new TextBook("0135166306", "Core Java Volume I--Fundamentals", "Cay S. Horstmann", 10, 50,
                0315454);

        book1.showDetails();
        System.out.println();
        System.out.println("After selling book");
        book1.sellQuantity(5);
        book1.showDetails();

        System.out.println("----Book 2----");
        TextBook book2 = new TextBook();
        book2.setIsbn("0134686047");
        book2.setBookTitle("Effective Java");
        book2.setAuthorName("Joshua Bloch");
        book2.setPrice(60.75);
        book2.setAvailableQuantity(30);
        book2.setStandard(0315454);
        book2.showDetails();

        System.out.println("----Book 3----");
        StoryBook book3 = new StoryBook();
        book3.setIsbn("1593275994");
        book3.setBookTitle("Clean Code");
        book3.setAuthorName("Robert C. Martin");
        book3.setPrice(80.75);
        book3.setAvailableQuantity(50);
        book3.setCategory("Programming");
        book3.showDetails();
        System.out.println("----Book 4----");

        StoryBook book4 = new StoryBook("1593275994", "Automate the Boring Stuff with Python", "Al Sweigart", 15, 56,
                "Programming");
        book4.sellQuantity(6);
        book4.showDetails();
        book4.addQuantity(20);
        System.out.println();
        book4.showDetails();
    }
}
