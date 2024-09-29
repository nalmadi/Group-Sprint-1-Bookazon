
import java.util.ArrayList;

public class User {
    private String name;
    private Subscription subscription;
    private Cart cart;
    private ArrayList<Order> orders;
    private Address shippingAddress;
    private Address billingAddress;

    public User(String name, Subscription subscription, Cart cart) {
        this.name = name;
        this.subscription = subscription;  // normal, gold, platinum, silver membership
        this.cart = cart;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription role) {
        this.subscription = role;
    }

    public void viewCart() {
        cart.viewCartDetails();
    }

    public void setShippingAddress(Address newAddress) {
        this.shippingAddress.setAddress(newAddress);
    }

    public void setBillingAddress(Address newAddress) {
        this.billingAddress.setAddress(newAddress);
    }

    public void addToCart(Media book, int quantity) {
        cart.addItem(new CartItem(book.getTitle(), book.getPrice(), quantity));
    }

    public void removeFromCart(Media book) {
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
        Address shippingAddress = new Address("123 Main St", "", "Springfield", "IL", "62701", "USA");
        Address billingAddress = new Address("123 Main St", "", "Springfield", "IL", "62701", "USA");
        order.setShippingAddress(shippingAddress);
        order.setBillingAddress(billingAddress);
        order.setOrderStatus(PLACED);
        order.setDateCreated(new Date(2024, 1, 1));
        order.setUserName(this.name);
        orders.add(order);
    }
}


