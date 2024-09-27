public class OtherAttributes {
    private double price;
    private boolean isPaperback;

    public OtherAttributes(double price, boolean isPaperback) {
        this.price = price;
        this.isPaperback = isPaperback;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isPaperback() {
        return isPaperback;
    }

    public void setPaperback(boolean isPaperback) {
        this.isPaperback = isPaperback;
    }

}