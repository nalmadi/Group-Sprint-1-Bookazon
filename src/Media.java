public abstract class Media{
    private double price;
    private String title;

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isPriceValid(){
        return price > 0;
    }

    public boolean isTitleValid() {
        // makes sure title has a string and that string is not empty
        return title != null && !title.isEmpty();
    }

}