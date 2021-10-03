public class BookMain {
    public static void main(String args[]) {

        Book ob[] = new Book[7];

        Book b1 = new Book("0135166306", "Core Java Volume I--Fundamentals", "Cay S. Horstmann", 0.18, 400, 350, 60, 200);
        Book b2 = new Book("1593275994", "Automate the Boring Stuff with Python", "Al Sweigart", 0.18, 300, 500, 40, 200);
        Book b3 = new Book("0135166306", "C++", "Bjarne Stroustrup", 0.18, 500, 500, 50, 100);
        Book b4 = new Book("1593275994", "HTML", "W3school", 0.18, 250, 600, 50, 100);
        Book b5 = new Book("0135166306", "C sharp", "Microsoft", 0.18, 700, 100, 50, 100);
        Book b6 = new Book("1593275994", "PHP", "Rasmus Lerdorf", 0.18, 200, 100, 50, 100);
        Book b7 = new Book("0135166306", "Javascript", "Douglas Crockford", 0.18, 200, 900, 50, 100);
        ob[0] = b1;
        ob[1] = b2;
        ob[2] = b3;
        ob[3] = b4;
        ob[4] = b5;
        ob[5] = b6;
        ob[6] = b7;
        System.out.println("books over 300");
        System.out.println("");

        for (int i = 0; i < 7; i++) {
            if (ob[i].getprice() > 300) {
                ob[i].showdetails();
                System.out.println();
            }
        }

    }

}