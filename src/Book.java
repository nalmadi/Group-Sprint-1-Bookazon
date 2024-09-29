public class Book extends Media implements ItemValidation{
    private boolean isPaperback;  // true if the book is paperback, false if it is hardcover

    public Book(String title, String author, int yearPublished, double price, boolean isPaperback) {
        super(title, author, yearPublished, price);
        this.isPaperback = isPaperback;
        this.mediaType = "Book";
    }

    public boolean isPaperback() {
        return isPaperback;
    }

    public void setPaperback(boolean isPaperback) {
        this.isPaperback = isPaperback;
    }

    @Override
    public boolean isPriceValid() {
        return price > 0;
    }

    @Override
    public boolean isTitleValid() {
        return title != null && !title.isEmpty();
    }

    @Override
    public boolean isAuthorValid() {
        return author != null && !author.isEmpty();
    }

    @Override
    public boolean isYearPublishedValid() {
        return yearPublished > 0;
    }
}