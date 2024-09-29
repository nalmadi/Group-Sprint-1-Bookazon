public class AudioBooks extends Media{

    public AudioBooks(String title, String author, int yearPublished, double price) {
        super(title, author, yearPublished, price);
        this.mediaType = "AudioBook";
    }

}
