public class PlatniumMember extends Subscription {
    private static final double DISCOUNT = 0.10;
    
    @Override
    public double getDiscount() {
        return DISCOUNT;
    }
}