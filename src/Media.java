public abstract class Media implements MediaValidation{
    protected String title;
    protected String author;
    protected int yearPublished;
    protected double price;

    protected int stockCount;
    private boolean isInStock; 

    public Media(String title, String author, int yearPublished, double price, int stockCount) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
        this.stockCount = stockCount;
        if(this.stockCount > 0){
            this.isInStock = true;
        }
    }

    public boolean isInStock(){
        return this.isInStock;
    }

    public int getStockCount(){
        return this.stockCount;
    }

    public void setStockCount(int newStockCount){
        this.stockCount = newStockCount;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Price: $" + price);
        System.out.println(this.stockCount + " items left in stock");
    }
    
}
