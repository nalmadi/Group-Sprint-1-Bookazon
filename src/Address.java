public class Address {

    private String addressLine1;
    private String addressLine2;
    private String addressCity;
    private String addressState;
    private String addressZip;
    private String addressCountry;

    public Address(String addressLine1, String addressLine2, String addressCity, String addressState, String addressZip, String addressCountry){
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressCity = addressCity;
        this.addressState = addressState;
        this.addressZip = addressZip;
        this.addressCountry = addressCountry;
    }

    public String getAddressLine1(){
        return addressLine1;
    }

    public String getAddressLine2(){
        return addressLine2;
    }

    public String getAddressCity(){
        return addressCity;
    }

    public String getAddressState(){
        return addressState;
    }

    public String getAddressZip(){
        return addressZip;
    }
    
    public String getAddressCountry(){
        return addressCountry;
    }

    public void setAddress(Address newAddress){
        this.addressLine1 = newAddress.addressLine1;
        this.addressLine2 = newAddress.addressLine2;
        this.addressCity = newAddress.addressCity;
        this.addressState = newAddress.addressState;
        this.addressZip = newAddress.addressZip;
        this.addressCountry = newAddress.addressCountry;
    }

}
