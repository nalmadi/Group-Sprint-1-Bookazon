public class BookAttributes {
    private String title;
    private String author;
    private int yearPublished;


    public BookAttributes (String title, String author, int yearPublished) {

        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYearPublished() {
        return this.yearPublished;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void setYearPublished(int newYearPublished) {
        this.yearPublished = newYearPublished;
    }
}