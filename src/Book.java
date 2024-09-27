public class Book {
    public String title;
    public String author;
    public int yearPublished;
    public double price;
    public boolean isPaperback;  // true if the book is paperback, false if it is hardcover

    public Book(BookAttributes bookAttributes, OtherAttributes otherAttributes) {
        this.title = bookAttributes.getTitle();
        this.author = bookAttributes.getAuthor();
        this.yearPublished = bookAttributes.getYearPublished();
        this.price = otherAttributes.getPrice();
        this.isPaperback = otherAttributes.isPaperback();
    }

    public void printBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
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