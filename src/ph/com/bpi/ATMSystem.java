package ph.com.bpi;

public class ATMSystem {

    // Account balances (index-based)
    static double[] accounts = {10000, 15000, 20000};

    public static void processWithdrawal(String accountIndex, String amountInput) {
        try {
            int index = Integer.parseInt(accountIndex);
            double balance = accounts[index];

            double amount = Double.parseDouble(amountInput);

            System.out.println("Current balance: Php" + String.format("%.2f", balance));
            System.out.println("Withdrawal: Php" + String.format("%.2f%n", amount));

            if (amount > balance) {
                System.out.println("Insufficient funds! Cannot withdraw Php" + String.format("%.2f", amount));
            } else {
                double newBalance = balance - amount;
                accounts[index] = newBalance;

                System.out.println("New balance: Php" + String.format("%.2f%n", newBalance));
                System.out.println("Withdrawal successful!");
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input!");
            System.out.println("Please enter valid numbers.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Account not found!");
            System.out.println("Invalid account index.");
        } catch (Exception e) {
            System.out.println("Transaction failed!");
        }
    }
}
