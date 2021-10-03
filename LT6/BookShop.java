public class BookShop {
    private String name;
    private TextBook textBook[] = new TextBook[100];
    private StoryBook storyBook[] = new StoryBook[100];

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
    /**
     * 
     * All function for TextBook
     */

    public boolean insertTextbook(TextBook tb) {
        for (int i = 0; i < 100; i++) {
            if (this.textBook[i] == null) {
                this.textBook[i] = tb;
                return true;
            }
        }
        return false;
    }

    public boolean removeTextbook(TextBook tb) {
        for (int i = 0; i < 100; i++) {
            if (storyBook[i] == null){
                continue;
            }
            if (textBook[i] == tb) {
                textBook[i] = null;
                return true;
            }
        }
        return false;
    }

    public TextBook searchTextbook(String isbn) {
        for (int i = 0; i < textBook.length; i++) {
            if (textBook[i].getIsbn() == isbn) {
                textBook[i].showDetails();
                return textBook[i];
            }
        }
        return null;

    }

    public void showAllTextbook() {
        for (int i = 0; i < textBook.length; i++) {
            if (this.textBook[i] != null) {
                this.textBook[i].showDetails();
            }
        }
    }


    // All function for  StoryBook
    public boolean insertStoryBook(StoryBook sb) {
        for (int i = 0; i < this.storyBook.length; i++) {
            if (this.storyBook[i] == null) {
                this.storyBook[i] = sb;
                return true;
            }
        }
        return false;
    }

    public boolean removeStoryBook(StoryBook sb) {
        for (int i = 0; i < 100; i++) {
            if (storyBook[i] == sb) {
                storyBook[i] = null;
                return true;
            }
        }
        return false;
    }
    

    public StoryBook searchStoryBook(String isbn) {
        for (int i = 0; i < storyBook.length; i++) {
            if (storyBook[i] == null){
                continue;
            }
            if (storyBook[i].getIsbn() == isbn) {
                storyBook[i].showDetails();
                return storyBook[i];
            }
        }
        return null;
    }

    public void showAllStoryBook() {
        for (int i = 0; i < storyBook.length; i++) {
            if (this.storyBook[i] != null) {
                this.storyBook[i].showDetails();
            }
        }
    }
}
