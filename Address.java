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
        validateAddressDetails(addressDetials); // validates the address details
        this.line1 = addressDetials.get(0);
        this.line2 = addressDetials.get(1);
        this.city = addressDetials.get(2);
        this.state = addressDetials.get(3);
        this.zip = addressDetials.get(4);
        this.country = addressDetials.get(5);      
    }

    public void validateAddressDetails(ArrayList<String> addressDetials){
        if (addressDetials.size() != 6) {
            throw new IllegalArgumentException("The address details is not correct. It should have 6 items");
        }
    }
}