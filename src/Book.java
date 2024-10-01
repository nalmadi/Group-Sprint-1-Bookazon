public class Book extends Media{
    private boolean isPaperback;  // true if the book is paperback, false if it is hardcover

    public Book(String title, String author, int yearPublished, double price, int stockCount, boolean isPaperback) {
        super(title, author, yearPublished, price, stockCount);
        this.isPaperback = isPaperback;
    }

    public boolean isPaperback() {
        return isPaperback;
    }

    public void setPaperback(boolean isPaperback) {
        this.isPaperback = isPaperback;
    }

}
