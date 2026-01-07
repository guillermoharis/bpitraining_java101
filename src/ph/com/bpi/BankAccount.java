package ph.com.bpi;

public class BankAccount {
   //get account name
   public static String getAccountName(String accountNumber) {
       if (accountNumber.equals("ACC-001")) {
           return "Juan Dela Cruz";
       } else if (accountNumber.equals("ACC-002")) {
           return "Maria Santos";
       } else {
           return null;
       }
   }
   
   //test case method
   public static void testCase(String accountNumber) {
       System.out.println("\nLooking up account: " + accountNumber);
       try {
           String name = getAccountName(accountNumber);
           String upperName = name.toUpperCase(); // will throw exception if name is null
           System.out.println("Account holder: " + upperName);
       } catch (NullPointerException e) {
           System.out.println("Error: Account not found!");
       }
   }
   
}

