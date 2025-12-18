package ph.com.bpi.hello.group.project3;
import java.util.Queue;
import java.util.Scanner;

public class AddProduct {
	
		public static void addProduct(Queue<Product> checkoutQueue, Scanner scanner) {
	        System.out.print("Enter product name: ");
	        String name = scanner.nextLine();

	        double price;
	        while (true) {
	            System.out.print("Enter product price: ");
	            if (scanner.hasNextDouble()) {
	                price = scanner.nextDouble();
	                scanner.nextLine(); // consume newline
	                if (price > 0) break;
	                else System.out.println("Price must be positive. Try again.");
	            } else {
	                System.out.println("Invalid input. Enter a numeric value.");
	                scanner.nextLine(); // clear invalid input
	            }
	        }

	        checkoutQueue.add(new Product(name, price));
	        System.out.println("Product added to checkout line!");
	      
	       
	    }

	}

