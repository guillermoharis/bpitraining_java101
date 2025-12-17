package ph.com.bpi.hello.group.project3;

import java.util.LinkedList;
import java.util.Queue;

/*

### **Group Activity #1: Practice Queue Operations**

**Activity:** Cashier Product Queue (LinkedListQueue)

***

#### **Goal:**

Simulate a **cashier checkout line** using a **LinkedListQueue** in Java and calculate the **total bill** as products are processed.

***

#### **Task:**

1.  **Create a queue of products** using **LinkedList**.
    *   Each product has: (Create a **Product** class)
        *   **Name** (String)
        *   **Price** (double)
2.  Start the program with **5 initial products** in the queue.
3.  Display a **menu repeatedly** until the user chooses to exit.

***

#### **Menu Options:**

1.  **Add a product**
    *   Prompt the user to enter the product name and price.
    *   Add the product to the **end of the queue**.
2.  **Process next product**
    *   Remove the first product from the queue (**FIFO**).
    *   Add the product price to the **total bill**.
    *   Display the processed product and the **updated total bill**.
3.  **Check number of products**
    *   Display how many products are currently waiting in the queue.
4.  **View total bill**
    *   Show the **total bill** of all products that have been processed.
5.  **Exit**
    *   Stop the program and display the **final total bill**.

 
 */
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Create a queue of products using LinkedList
        Queue<Product> productQueue = new LinkedList<>();

        // Add 5 initial products
        productQueue.add(new Product("Laptop", 45000.00));
        productQueue.add(new Product("Smartphone", 25000.00));
        productQueue.add(new Product("Headphones", 1500.00));
        productQueue.add(new Product("Keyboard", 800.00));
        productQueue.add(new Product("Mouse", 500.00));
        

        // Display all products in the queue
        System.out.println("Initial Products in Queue:");
        for (Product p : productQueue) {
            System.out.println(p);
        }

        
        ProductService productService = new ProductService(productQueue);
        productService.addProduct(new Product("Screen Protector",99.99));
        
        

        // Display all products in the queue
        System.out.println("Initial Products in Queue:");
        for (Product p : productQueue) {
            System.out.println(p);
        }

        
        
	}

}
