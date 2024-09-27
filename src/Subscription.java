

public abstract class Subscription {
    private double discount = 0;

    public Subscription(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
}

