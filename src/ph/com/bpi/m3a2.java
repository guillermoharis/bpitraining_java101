package ph.com.bpi;

import java.util.HashSet;
import java.util.Scanner;

public class m3a2 {
	
	public static void main(String[] args) {
		
		HashSet<String> computerPeripherals = new HashSet<>();
		
		Scanner input = new Scanner(System.in);
		int optionNumber;

		do {
			
			System.out.println("=== Product Menu ===");
			System.out.println("1. Search a product");
			System.out.println("2. Add a product");
			System.out.println("3. Print all products");
			System.out.println("4. Exit");
			
			System.out.println("");
			System.out.print("Select number from the list above: ");
			
			optionNumber = input.nextInt();
			input.nextLine();

			
			switch (optionNumber) {
			
				case 1: //search a product
					if (computerPeripherals.isEmpty()) {
						System.out.println("No computer peripherals available");
						System.out.println("");
						break;
					}
					
					System.out.print("Enter product name to search: ");
					String searchProduct = input.nextLine();
					
					if (computerPeripherals.contains(searchProduct)) {
						System.out.println("Product found: " + searchProduct);
					}
				
					else {
						System.out.println("Product not found.");
					}
					
					System.out.println("");
					break;
			
				case 2: //add a product
					System.out.print("Enter computer peripheral to add: ");
					String addProduct = input.nextLine();
				
					if (computerPeripherals.add(addProduct)) {
						System.out.println("Computer peripheral added successfully: ");
					}
			
					else {
						System.out.println("Computer peripheral already exists.");
					}
					
					System.out.println("");
					break;
					
				case 3: //print all computer peripherals
					System.out.println("Computer peripheral list: ");
					System.out.println("");
					
					int count = 1;
					
					for (String product : computerPeripherals) {
						System.out.println(count++ + ". " + product);
					}
					
					System.out.println("");
					System.out.println("Total products:  " + computerPeripherals.size());
					System.out.println("");
					
					break;
					
				case 4: //exit
					System.out.println("Exiting program...");
					break;
					
				default:
					System.out.println("Invalid option. Please choose on the menu item option numbeer");
			} 
		} while (optionNumber != 4);
		
		//input.close();
		
		}
	}
			
		
