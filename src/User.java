
import java.util.ArrayList;

public class User {
    private String name;
    private String subscription;
    private Cart cart;
    private ArrayList<Order> orders;
    private Addressable shippingAddress;
    private Addressable billingAddress;

    public User(String name, String subscription) {
        this.name = name;
        this.subscription = subscription;  // normal, gold, platinum, silver membership
        this.cart = new Cart();
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSubscription() {
        return subscription;
    }

    public void setSubscription(String role) {
        this.subscription = role;
    }

    public void viewCart() {
        cart.viewCartDetails();
    }

    public void setShippingAddress(Addressable shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void setBillingAddress(Addressable billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void addToCart(Book book, int quantity) {
        cart.addItem(new CartItem(book.getTitle(), book.getPrice(), quantity));
    }

    public void removeFromCart(Book book) {
        for (CartItem item : cart.getItems()) {
            if (item.getName().equals(book.getTitle())) {
                cart.getItems().remove(item);
                break;
            }
        }
    }

    public void viewOrders() {
        for (Order order : orders) {
            order.printOrderDetails();
        }
    }

    public void checkout() {
        Order order = new Order(cart, this.subscription);
        order.setShippingAddress(shippingAddress.getStreetAddress(), shippingAddress.getApartmentNumber(),
                shippingAddress.getCity(), shippingAddress.getState(), shippingAddress.getZipCode(),
                shippingAddress.getCountry());

        order.setBillingAddress(billingAddress.getStreetAddress(), billingAddress.getApartmentNumber(),
                billingAddress.getCity(), billingAddress.getState(), billingAddress.getZipCode(),
                billingAddress.getCountry());
        order.setOrderStatus("Order Placed");
        order.setDateCreated("2024-01-01");
        order.setUserName(this.name);
        orders.add(order);
    }
}


