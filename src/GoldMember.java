public class GoldMember extends Subscription {
    private static final double DISCOUNT = 0.05;
    
    @Override
    public double getDiscount() {
        return DISCOUNT;
    }
}