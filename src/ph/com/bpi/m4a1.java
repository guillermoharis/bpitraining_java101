package ph.com.bpi;

public class m4a1 {

	   //main method
	   public static void main(String[] args) {
	       System.out.println("=== Bank Account Name Display ===");
	       // Valid account
	       BankAccount.testCase("ACC-001");
	       // Invalid account
	       BankAccount.testCase("ACC-999");
	       System.out.println("");
	       System.out.println("=== Program completed successfully! ===");
	   }

}
