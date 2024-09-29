public class Ebook extends Media{

    public Ebook(String title, String author, int yearPublished, double price) {
        super(title, author, yearPublished, price);
        this.mediaType = "E-Book";
    }
    
}
