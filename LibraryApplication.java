package GroupProject;

import java.util.Scanner;

public class LibraryApplication {
	Scanner sc = new Scanner(System.in);
	private User user;
	private Library library;
	
	public void start() {
		System.out.print("Enter your name: ");
		String username = sc.nextLine();
		this.user = new User(username);
		
		this.library = new Library();
		library.addBook(new Book(0, "Ibong Adarna", "Anonymous"));
		library.addBook(new Book(1, "Florante at Laura", "Francisco Balagtas"));
		library.addBook(new Book(2, "Noli Me Tangere", "Dr. Jose Rizal"));
		library.addBook(new Book(3, "El Filibusterismo", "Dr. Jose Rizal"));
		library.addBook(new Book(4, "Sa Mga Kuko ng Liwanag", "Edgardo M. Reyes"));

		while (true) {
			System.out.println("\n========= OPTIONS =========");
			System.out.println("[1] Display All books");
			System.out.println("[2] Display Available books");
			System.out.println("[3] Display Borrowed books");
			System.out.println("[4] Borrow a book");
			System.out.println("[5] Return a book");
			System.out.println("[0] Exit");
			System.out.print("\nSelect Option: ");

			String input = sc.nextLine();

			if (input.length() == 0) {
				continue;
			}

			char option = input.charAt(0);

			switch (option) {
				case '1':
					library.displayAllBooks();
					break;
				case '2':
					library.displayAvailableBooks();
					break;
				case '3':
					library.displayBorrowedBooks();
					break;
				case '4':
					library.displayAvailableBooks();
					System.out.print("\nEnter Book ID to borrow: ");
					int borrowID = sc.nextInt();
					sc.nextLine();
					if (library.borrowBook(borrowID, user)) {
						System.out.println("\nBorrowed successfully!");
					} else {
						System.out.println("\nUnable to borrow!");
					}
					break;
				case '5':
					library.displayBorrowedBooks();
					System.out.print("\nEnter Book ID to return: ");
					int returnID = sc.nextInt();
					sc.nextLine();
					if (library.returnBook(returnID, user)) {
						System.out.println("\nReturned successfully!");
					} else {
						System.out.println("\nUnable to return!");
					}
					break;
				case '0':
					System.out.println("\nLibrary closed.");
					return;
				default:
					System.out.println("\nInvalid option!");
			}
		}	
	}
}
