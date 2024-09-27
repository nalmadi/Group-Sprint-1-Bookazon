public class Book extends Media {
    private String title;
    private String creator;
    private int yearPublished;
    private double price;
    private boolean isPaperback;  // true if the book is paperback, false if it is hardcover

    public Book(String title, String creator, int yearPublished, double price, boolean isPaperback) {
        super(title, creator, yearPublished, price);
        this.isPaperback = isPaperback;
    }

    public void printBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + creator);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Price: $" + price);

    }

    // public void setTitle(String newTitle) {
    //     this.title = newTitle;
    // }

    // public void setAuthor(String newAuthor) {
    //     this.author = newAuthor;
    // }

    // public void setYearPublished(int newYearPublished) {
    //     this.yearPublished = newYearPublished;
    // }

    // public String getTitle() {
    //     return title;
    // }

    // public void setTitle(String title) {
    //     this.title = title;
    // }

    // public String getAuthor() {
    //     return author;
    // }

    // public void setAuthor(String author) {
    //     this.author = author;
    // }

    // public int getYearPublished() {
    //     return yearPublished;
    // }

    // public void setYearPublished(int yearPublished) {
    //     this.yearPublished = yearPublished;
    // }

    // public double getPrice() {
    //     return price;
    // }

    // public void setPrice(double price) {
    //     this.price = price;
    // }

    // public boolean isPaperback() {
    //     return isPaperback;
    // }

    // public void setPaperback(boolean isPaperback) {
    //     this.isPaperback = isPaperback;
    // }



    /*
     * Can be deleted due to unused code
     * 
     */
    // public boolean isPriceValid() {
    //     return price > 0;
    // }

    // public boolean isTitleValid() {
    //     return title != null && !title.isEmpty();
    // }

    // public boolean isAuthorValid() {
    //     return author != null && !author.isEmpty();
    // }

    // public boolean isYearPublishedValid() {
    //     return yearPublished > 0;
    // }
}