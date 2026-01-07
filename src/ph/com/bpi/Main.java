package ph.com.bpi;

public class Main {

    public static void main(String[] args) {

        // Test 1: Valid Savings account
        ATMTransaction.checkBalance("100123456", 15000.00);

        // Test 2: Valid Checking account
        ATMTransaction.checkBalance("200987654", 25000.00);

        // Test 3: Invalid account format
        ATMTransaction.checkBalance("ABC12345", 15000.00);

        // Test 4: Empty account number
        ATMTransaction.checkBalance("", 15000.00);
    }
}
