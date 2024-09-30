public class Ebook extends Media {
    private String format; // "PDF", "EPUB", "MOBI"
    private int fileSize; // in MB

    public Ebook(String title, String author, int yearPublished, double price, String format, int fileSize) {
        super(title, author, yearPublished, price);
        this.format = format;
        this.fileSize = fileSize;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public void printBookDetails() {
        super.printBookDetails();
        System.out.println("Format: " + format);
        System.out.println("File Size: " + fileSize + " MB");
    }
}