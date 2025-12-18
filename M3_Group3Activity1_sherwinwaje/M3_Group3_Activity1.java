package ph.com.bpi.hello.group.project3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class M3_Group3_Activity1 {

	public static void main(String[] args) {

		Queue<Product> checkoutQueue = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
		double totalBill = 0.0;

		// Add 5 initial products
		checkoutQueue.add(new Product("Laptop", 1200.50));
		checkoutQueue.add(new Product("Phone", 800.00));
		checkoutQueue.add(new Product("Headphones", 150.75));
		checkoutQueue.add(new Product("Keyboard", 99.99));
		checkoutQueue.add(new Product("Mouse", 49.50));

		int choice;
		do {
			DisplayMenu.displayMenu();
			choice = InputValidation.getIntInput("Enter your choice: ");
			switch (choice) {
			case 1:
				AddProduct.addProduct(checkoutQueue, scanner);
				break;
			case 2:
				totalBill = ProcessNextProduct.processNextProduct(checkoutQueue, totalBill);
				break;
			case 3:
				CheckNumberOfProduct.checkNumberOfProduct(checkoutQueue);
				break;
			case 4:
				ViewTotalBill.viewTotalBill(totalBill);
				break;
			case 5:
				ExitProgram.exitProgram(checkoutQueue, totalBill);
				break;
			default:
				System.out.println("Invalid choice. Try again.");
			}
		} while (choice != 5);
		scanner.close();

	}

}
