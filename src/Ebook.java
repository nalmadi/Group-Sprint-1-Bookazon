public class Ebook extends Media implements EbookValidation{
    private String format; // "PDF", "EPUB", "MOBI"
    private int fileSize; // in MB

    public Ebook(String title, String author, int yearPublished, double price, int stockCount, String format, int fileSize) {
        super(title, author, yearPublished, price, stockCount);
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

    public void printProductDetails() {
        super.printProductDetails();
        System.out.println("Format: " + format);
        System.out.println("File Size: " + fileSize + " MB");
    }
}
