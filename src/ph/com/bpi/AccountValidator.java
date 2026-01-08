package ph.com.bpi;

public class AccountValidator {

    public static void validateAccountNumber(String accountNumber)
            throws InvalidAccountNumberException {

        // 1) Check null
        if (accountNumber == null) {
            throw new NullPointerException("Account number cannot be null");
        }

        // 2) Check format (digits only)
        for (char c : accountNumber.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new InvalidAccountFormatException("Account number must contain only digits");
            }
        }

        // 3) Check length
        if (accountNumber.length() != 10) {
            throw new InvalidAccountNumberException("Account number must be exactly 10 digits");
        }

        // 4) Valid
        System.out.println("Valid account number: " + accountNumber);
    }

    // Helper method to avoid repeating try-catch
    public static void testValidation(String testName, String accountNumber) {
        System.out.println(testName);

        try {
            validateAccountNumber(accountNumber);
        } catch (InvalidAccountNumberException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidAccountFormatException e) {
            System.out.println("Warning: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Warning: " + e.getMessage());
        }

        System.out.println();
    }
}