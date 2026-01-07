package ph.com.bpi;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== ATM Withdrawal System ===\n");

        System.out.println("--- Test 1: Valid Withdrawal ---");
        System.out.println("Account=1, Amount=5000");
        ATMSystem.processWithdrawal("1", "5000");
        System.out.println();

        System.out.println("--- Test 2: Invalid Account Index ---");
        System.out.println("Account=abc, Amount=5000");
        ATMSystem.processWithdrawal("abc", "5000");
        System.out.println();

        System.out.println("--- Test 3: Account Not Found ---");
        System.out.println("Account=10, Amount=5000");
        ATMSystem.processWithdrawal("10", "5000");
        System.out.println();

        System.out.println("--- Test 4: Insufficient Funds ---");
        System.out.println("Account=1, Amount=20000");
        ATMSystem.processWithdrawal("1", "20000");
        System.out.println();

        System.out.println("=== All tests completed! ===");
    }
}