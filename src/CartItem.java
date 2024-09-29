public class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean equals(CartItem item) {
        return this.itemName.equals(item.getName());
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public String printCartItemDetails(CartItem item){
        if (item instanceof DVD){
            return item.printBookDetails
        }

        if (item instanceof Book){
            return item.printDVDDetails
        }

        if (item instanceof AudioBook){
            return item.printAudioBookDetails
        }
    }
}
