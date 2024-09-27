public class AddressValidationTest {

    public static void main(String[] args) {
        // Test case 1: Valid address with line 2
        try {
            Address address1 = new Address("123 Main St", "Apt 4B", "Waterville", "ME", "04901", "USA");
            AddressValidator.validateAddress(address1.getLine1(), address1.getCity(), address1.getState(), address1.getZipCode());
            System.out.println("Test case 1 passed: " + address1);
        } catch (IllegalArgumentException e) {
            System.out.println("Test case 1 failed: " + e.getMessage());
        }

        // Test case 2: Valid address without line 2
        try {
            Address address2 = new Address("456 Oak Ave", null, "Oakland", "AZ", "62704", "USA");
            AddressValidator.validateAddress(address2.getLine1(), address2.getCity(), address2.getState(), address2.getZipCode());
            System.out.println("Test case 2 passed: " + address2);
        } catch (IllegalArgumentException e) {
            System.out.println("Test case 2 failed: " + e.getMessage());
        }

        // Test case 3: Invalid address (missing line1)
        try {
            Address address3 = new Address("", null, "Springfield", "IL", "62704", "USA");
            AddressValidator.validateAddress(address3.getLine1(), address3.getCity(), address3.getState(), address3.getZipCode());
            System.out.println("Test case 3 failed (should not reach this line).");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected exception for test case 3: " + e.getMessage());
        }

        // Test case 4: Invalid state
        try {
            Address address4 = new Address("789 Pine St", null, "Springfield", "Illinois", "62704", "USA");
            AddressValidator.validateAddress(address4.getLine1(), address4.getCity(), address4.getState(), address4.getZipCode());
            System.out.println("Test case 4 failed (should not reach this line).");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected exception for test case 4: " + e.getMessage());
        }

        // Test case 5: Invalid zip code (less than 5 digits)
        try {
            Address address5 = new Address("987 Elm St", null, "Springfield", "IL", "6270", "USA");
            AddressValidator.validateAddress(address5.getLine1(), address5.getCity(), address5.getState(), address5.getZipCode());
            System.out.println("Test case 5 failed (should not reach this line).");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected exception for test case 5: " + e.getMessage());
        }
    }
}
