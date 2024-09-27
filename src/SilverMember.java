public class SilverMember extends Subscription {
    private static final double DISCOUNT = 0.20;
    
    @Override
    public double getDiscount() {
        return DISCOUNT;
    }
}