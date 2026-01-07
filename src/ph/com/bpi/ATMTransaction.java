package ph.com.bpi;

public class ATMTransaction {

    public static void checkBalance(String accountNumber, double balance) {

        try {
            System.out.println("Processing balance inquiry...");

            // Validate numeric account number
            Integer.parseInt(accountNumber);

            // Determine account type
            char accountType = accountNumber.charAt(0);

            if (accountType == '1') {
                System.out.println("Account Type: Savings");
            } else if (accountType == '2') {
                System.out.println("Account Type: Checking");
            } else {
                System.out.println("Account Type: Unknown");
            }

            System.out.println("Account Number: " + accountNumber);
            System.out.println("Current Balance: P" + balance);
            System.out.println("Balance inquiry successful!");

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid account number format! Account numbers must be numeric.");

        } finally {
            System.out.println();
            System.out.println("========== RECEIPT ==========");
            System.out.println("Transaction Date: December 3, 2025");
            System.out.println("Transaction Type: Balance Inquiry");
            System.out.println("ATM Location: Main Branch");
            System.out.println("Thank you for banking with us!");
            System.out.println("=============================");
        }
    }
}