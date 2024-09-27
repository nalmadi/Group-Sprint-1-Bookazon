public abstract class Address {
    private String addressLine1;
    private String addressLine2;
    private String addressCity;
    private String addressState;
    private String addressZip;
    private String addressCountry;

    public Address(String line1, String line2, String city, String state, String zip, String country) {
        this.addressLine1 = line1;
        this.addressLine2 = line2;
        this.addressCity = city;
        this.addressState = state;
        this.addressZip = zip;
        this.addressCountry = country;
    }

    // Add getters for each variable for use in the Order class.
    public String getLine1(){
        return addressLine1;
    }

    public String getLine2(){
        return addressLine2;
    }

    public String getCity(){
        return addressCity;
    }

    public String getState(){
        return addressState;
    }

    public String getZip(){
        return addressZip;
    }

    public String getCountry(){
        return addressCountry;
    }

    abstract public void printAddress();


}
