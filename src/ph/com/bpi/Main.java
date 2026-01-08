package ph.com.bpi;

public class Main {
    public static void main(String[] args) {

        // Test cases
        String[] testCases = {
            "1234567890", // valid
            "123",        // too short
            null          // null
        };

        for (String test : testCases) {
            try {
                AccountValidator.validateAccountNumber(test);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

}
