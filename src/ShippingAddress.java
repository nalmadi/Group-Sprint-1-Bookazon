public class ShippingAddress extends Address{

    public ShippingAddress(String line1, String line2, String city, String state, String zip, String country){
        super(line1, line2, city, state, zip, country);
    }

    public void printAddress(){
        System.out.println("Shipping Address: " + this.getLine1() + ", " + this.getLine2() + ", " + this.getCity() + ", " + this.getState() + ", " + this.getZip() + ", " + this.getCountry());
    }
    
}
