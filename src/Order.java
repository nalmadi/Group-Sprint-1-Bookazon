import java.util.ArrayList;

enum OrderStatus {
    PLACED, PROCESSING, SHIPPED, DELIVERED, CANCELLED
}

public class Order {
    private Date dateCreated;
    private Date dateShipped;
    private String userName;
    private OrderStatus orderStatus;
    private Subscription subscription;
    private Address shippingAddress;
    private Address billingAddress;
  
    private ArrayList<CartItem> items;
    private double orderPrice;

    public Order(Cart cart, Subscription subscription) {
        this.items = cart.getItems();
        this.subscription = subscription;
        this.orderPrice = calculatePrice();
    }

    public void setShippingAddress(Address newAddress) {
        this.shippingAddress.setAddress(newAddress);
    }

    public void setBillingAddress(Address newAddress) {
        this.billingAddress.setAddress(newAddress);
    }

    public void setOrderStatus(OrderStatus status) {
        this.orderStatus = status;
    }

    public void setDateCreated(Date date) {
        this.dateCreated = date;
    }

    public void setDateShipped(Date date) {
        this.dateShipped = date;
    }

    public void setUserName(String name) {
        this.userName = name;
    }

    public void printOrderDetails() {
        System.out.println("Order Details:");
        System.out.println("Date Created: " + dateCreated);
        System.out.println("Date Shipped: " + dateShipped);
        System.out.println("User Name: " + userName);
        System.out.println("Order Status: " + orderStatus);
        System.out.println("Shipping Address: " + shippingAddress.getAddressLine1() + ", " + shippingAddress.getAddressLine2() + ", " + shippingAddress.getAddressCity() + ", " + shippingAddress.getAddressState() + ", " + shippingAddress.getAddressZip() + ", " + shippingAddress.getAddressCountry());
        System.out.println("Billing Address: " + billingAddress.getAddressLine1() + ", " + billingAddress.getAddressLine2() + ", " + billingAddress.getAddressCity() + ", " + billingAddress.getAddressState() + ", " + billingAddress.getAddressZip() + ", " + billingAddress.getAddressCountry());
        System.out.println("Order Price: $" + orderPrice);
    }

    
    public double calculatePrice() {
        double totalPrice = 0.0;
        for (CartItem item : items) {
            totalPrice += item.getTotalPrice();
        }
        return subscription.applyDiscount(totalPrice);
    }
   
}

interface Subscription {
    double applyDiscount(double price);
}

class GoldSubscription implements Subscription {
    public double applyDiscount(double price) {
        return price * 0.85; // 15% discount
    }
}

class PlatinumSubscription implements Subscription {
    public double applyDiscount(double price) {
        return price * 0.90; // 10% discount
    }
}

class SilverSubscription implements Subscription {
    public double applyDiscount(double price) {
        return price * 0.95; // 5% discount
    }
}

class NormalSubscription implements Subscription {
    public double applyDiscount(double price) {
        return price; // No discount
    }
}
