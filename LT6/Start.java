public class Start {
    public static void main(String[] args) {
        System.out.println("----Book 1----");
        TextBook book1 = new TextBook("0135166306", "Core Java Volume I--Fundamentals", "Cay S. Horstmann", 10, 50,
                0315454);

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
        book2.setStandard(9876223);
        book2.showDetails();

        TextBook book3 = new TextBook("3689656869", "Java: A Beginner’s Guide", "Herbert Schildt", 12, 90,
                879331);
        TextBook book4 = new TextBook("989787563", "Head First Java", "Kathy Sierra & Bert Bates", 15, 12,
                658783);
        TextBook book5 = new TextBook("878784525474", "Java Performance: The Definite Guide", "Scott Oaks", 23, 54,
                2345968);


        // System.out.println("----Book 6----");
        StoryBook sBook1 = new StoryBook();
        sBook1.setIsbn("1593275994");
        sBook1.setBookTitle("Clean Code");
        sBook1.setAuthorName("Robert C. Martin");
        sBook1.setPrice(80.75);
        sBook1.setAvailableQuantity(50);
        sBook1.setCategory("Programming");
        sBook1.showDetails();
        System.out.println("----Book 4----");

        StoryBook sBook2 = new StoryBook("6859894756", "Automate the Boring Stuff with Python", "Eric Matthews", 14, 46,
        "python");
        sBook2.sellQuantity(6);
        sBook2.showDetails();
        sBook2.addQuantity(20);
        sBook2.showDetails();

        StoryBook sBook3 = new StoryBook("19878522487", "Learning Python, 5th Edition", "Mark Lutz", 15, 56,
        "python");
        StoryBook sBook4 = new StoryBook("5887999", "Head-First Python (2nd edition)", "Paul Barry ", 25, 36,
        "python");

        StoryBook sBook5 = new StoryBook("459854852429", "A Byte of Python", "C.H. Swaroop", 35, 66,
        "progamming");

        BookShop shop = new BookShop("Rokomari");
        shop.insertTextbook(book1);
        shop.insertTextbook(book2);
        shop.insertTextbook(book3);
        shop.insertTextbook(book4);
        shop.insertTextbook(book5);

        shop.showAllTextbook();
        if (shop.removeTextbook(book5)){
            System.out.println(book5.getBookTitle() +"is removed");
        }

        TextBook searchTextBook = shop.searchTextbook("0135166306");
        if(searchTextBook != null){
            System.out.println("Result from search");
            searchTextBook.showDetails();
        }


        //Story Book

        shop.insertStoryBook(sBook1);
        shop.insertStoryBook(sBook2);
        shop.insertStoryBook(sBook3);
        shop.insertStoryBook(sBook4);
        shop.insertStoryBook(sBook5);
        shop.showAllStoryBook();
        if (shop.removeStoryBook(sBook1)){
            System.out.println(sBook1.getBookTitle() +"is removed");
        }


        StoryBook searchStoryBook = shop.searchStoryBook("459854852429");
        if(searchStoryBook != null){
            System.out.println("Result from search");
            searchStoryBook.showDetails();
        }


    }
}
