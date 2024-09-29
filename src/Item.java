public interface Item {
    public String getTitle();
    public void setTitle(String title);
    public double getPrice();
    public void setPrice(double price);
    public String toString();
    public boolean isPriceValid();
    public boolean isTitleValid();
}
