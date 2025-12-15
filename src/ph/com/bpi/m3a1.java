package ph.com.bpi;

import java.util.ArrayList;
import java.util.Scanner;

public class m3a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> computerperipheral = new ArrayList<>();
		
		computerperipheral.add("Laptop");
		computerperipheral.add("Mouse");
		computerperipheral.add("Keyboard");
		computerperipheral.add("Monitor");
		computerperipheral.add("Printer");
		
		System.out.println("All Products:");
		System.out.println("");
		
		for (int i = 0; i < computerperipheral.size(); i++ ) {
			System.out.println((i + 1) + ". " + computerperipheral.get(i));
		}

		computerperipheral.remove("Mouse");
		computerperipheral.add("Webcam");
		
		System.out.println("");
		System.out.println("After adding and removing products:");
		System.out.println("");
		
		for (int i = 0; i < computerperipheral.size(); i++ ) {
			System.out.println((i + 1) + ". " + computerperipheral.get(i));
		}			
			
		Scanner input = new Scanner(System.in);
		
		System.out.println("");
		System.out.print("Enter product name to search: ");
		String searchitem = input.nextLine();
				
			
		if (computerperipheral.contains(searchitem)) {
			System.out.println("Product found: " + searchitem);
		}
		
		else {
			System.out.println("Product not found.");
	
		}
		
	}

}
