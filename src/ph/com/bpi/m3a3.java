package ph.com.bpi;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class m3a3 {

	static Map<String, Double> computerPeripherals = new TreeMap<>();
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int optionNumber;

		do {
			
			displayOptions();
					
			optionNumber = input.nextInt();
			input.nextLine();

			
			switch (optionNumber) {
			
            	case 1:
            		searchProduct();
            		break;
            		
            	case 2:
            		addProduct();
            		break;
            		
            	case 3:
            		printAllProducts();
            		break;
            		
            	case 4:
            		findCheapestProduct();
            		break;
            		
            	case 5:
            		System.out.println("Exiting program...");
            		break;
            		
            	default:
            		System.out.println("Invalid option. Try again.");
			}
		} while (optionNumber != 5);
		
		input.close();
		
	}

	private static void displayOptions() {
		System.out.println("=== Select an option ===");
		System.out.println("1. Search a product");
		System.out.println("2. Add a product");
		System.out.println("3. Print all products");
		System.out.println("4. Find the cheapest product");
		System.out.println("5. Exit");
		
		System.out.println("");
		System.out.print("Select option from the list above: ");
	}
	
	private static void searchProduct() {
		System.out.print("Enter product name to search: ");
		String searchProduct = input.nextLine();
		
		if (computerPeripherals.isEmpty()) {
			System.out.println("No computer peripherals available");
			System.out.println("");
		}
		
		if (computerPeripherals.containsKey(searchProduct)) {
			System.out.println("Product found! Price: " + computerPeripherals.get(searchProduct));
	        System.out.println("");
		}
	
		else {
			System.out.println("Product not found.");
	        System.out.println("");
		}
	}
	
	private static void addProduct() {
        System.out.print("Enter product name: ");
        String name = input.nextLine();

        System.out.print("Enter product price: ");
        double price = input.nextDouble();
        input.nextLine();

        computerPeripherals.put(name, price);
        System.out.println("Product added: " + name);
        System.out.println("");
	}
	
    private static void printAllProducts() {
        if (computerPeripherals.isEmpty()) {
            System.out.println("No products available.");
            System.out.println("");
            return;
        }

        System.out.println("All product and prices:");
        for (Map.Entry<String, Double> entry : computerPeripherals.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        
        System.out.println("Total products: " + computerPeripherals.size());
        System.out.println("");
    }
    
    private static void findCheapestProduct() {
        String cheapestProduct = null;
        double lowestPrice = Double.MAX_VALUE;

        for (Map.Entry<String, Double> entry : computerPeripherals.entrySet()) {
            if (entry.getValue() < lowestPrice) {
                lowestPrice = entry.getValue();
                cheapestProduct = entry.getKey();
            }
        }

        System.out.println("Cheapest product: " + cheapestProduct + " - " + lowestPrice);
        System.out.println("");
    }
}
