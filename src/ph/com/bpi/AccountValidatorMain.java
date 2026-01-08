package ph.com.bpi;

public class AccountValidatorMain {

    public static void main(String[] args) {

        System.out.println("=== Account Number Validation Test ===\n");

        AccountValidator.testValidation("Test 1: Valid account (1234567890)", "1234567890");
        AccountValidator.testValidation("Test 2: Too short (123)", "123");
        AccountValidator.testValidation("Test 3: Contains letters (12345ABC90)", "12345ABC90");
        AccountValidator.testValidation("Test 4: Contains space (1234 567890)", "1234 567890");
        AccountValidator.testValidation("Test 5: Null value", null);
    }
}