package ph.com.bpi.hello.group.project3;

 
import java.util.Queue;

public class ProcessNextProduct {
	
 
    
		  public static double processNextProduct(Queue<Product> checkoutQueue, double totalBill) {
		        if (checkoutQueue.isEmpty()) {
		            System.out.println("No products in the queue.");
		            return totalBill;
		        }
		        Product next = checkoutQueue.poll(); // FIFO
		        totalBill += next.getPrice();
		        System.out.println("Processed: " + next.getName() + " - Php " + next.getPrice());
		        System.out.println("Updated Total Bill: Php " + totalBill);
		        return totalBill;
		    }


	}


