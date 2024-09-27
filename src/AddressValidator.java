public class AddressValidator {


    public static void validateAddress(String line1, String city, String state, String zipCode) {
        if (line1 == null || line1.isEmpty()) {
            throw new IllegalArgumentException("Address Line 1 is required.");
        }
        if (city == null || city.isEmpty()) {
            throw new IllegalArgumentException("City is required.");
        }
        if (state == null || state.length() != 2) {
            throw new IllegalArgumentException("State must be a 2-letter code.");
        }
        if (zipCode == null || !zipCode.matches("\\d{5}")) {
            throw new IllegalArgumentException("Invalid Zip Code. Must be a 5-digit number.");
        }
    }
 }
 
