public class CartItem{
    private Media item;
    private int quantity;

    public CartItem(Media item, int quantity) {
        this.item = item ;
        this.quantity = quantity;
    }

    public String getName() {
        return item.getTitle();
    }

    public double getPrice() {
        return item.getPrice();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        this.item.setStockCount(this.item.getStockCount() - quantity);
    }


    public boolean equals(CartItem item) {
        return this.item.getTitle().equals(item.getName());
    }

    public double getTotalPrice() {
        return item.getPrice() * quantity;
    }
}
