package ph.com.bpi.hello.group.project2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LibraryApplication libraryApplication = new LibraryApplication();
		libraryApplication.start();

		/*
		 * 1. Upon application start, ask user to create one User
		 */
		System.out.println("Create one user.  Please enter name: ");
		String inputtedName=input.nextLine();
		System.out.println("Hi " + inputtedName);
		
		User user = new User(inputtedName);
		
		/*
		 * 2. Create one Library object
		 * 3. Initialize 5 Book objects and add it to all Library slots
		 */
		
		Library library = new Library();
		
		
		
		
		

	}
}
