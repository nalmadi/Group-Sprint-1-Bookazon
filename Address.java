import java.io.IOException;
import java.util.ArrayList;

public class Address {

    private String line1;
    private String line2;
    private String city;
    private String state;
    private String zip;
    private String country;


    public Address(ArrayList<String> addressDetials){
        setAddress(addressDetials); // Reuses the setAdddress method
    }

    public void setAddress(ArrayList<String> addressDetials) {
        try {
            this.line1 = addressDetials.get(0);
            this.line2 = addressDetials.get(1);
            this.city = addressDetials.get(2);
            this.state = addressDetials.get(3);
            this.zip = addressDetials.get(4);
            this.country = addressDetials.get(5);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("the address details list should have 6 elements");
        };
    }
}