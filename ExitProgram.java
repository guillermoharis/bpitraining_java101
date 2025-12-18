package ph.com.bpi.hello.group.project3;

import java.util.Queue;

public class ExitProgram {

	public static void exitProgram(Queue<Product> checkoutQueue, double totalBill) {
		System.out.println("");
		System.out.println("Closing Cashier line...");
		System.out.println("");
		System.out.println("Final Total Bill: Php" + totalBill);

		checkoutQueue.forEach(System.out::println);

	}

}
