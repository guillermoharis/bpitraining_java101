package ph.com.bpi.hello.group.project3;

import java.util.Queue;

public class ProductService implements ProductInterface {

	/*
	 * 1.  **Create a queue of products** using **LinkedList**.
    *   Each product has: (Create a **Product** class)
        *   **Name** (String)
        *   **Price** (double)
2.  Start the program with **5 initial products** in the queue.
	 * 
	 * 
	 * 1.  **Add a product**
    *   Prompt the user to enter the product name and price.
    *   Add the product to the **end of the queue**.
	 */
	
	private Queue<Product> productQueue; 
	 
	
	public ProductService() {
		
	}
	public ProductService(Queue<Product> productQueue) {
		this.productQueue = productQueue;
	}
	
	 
	public Queue<Product> addProduct(Product product) {
		this.productQueue.add(product);
		return productQueue;
	}
}
