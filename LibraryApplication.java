package GroupProject;

import java.util.Scanner;

public class LibraryApplication {
	Scanner sc = new Scanner(System.in);
	private User user;
	private Library library;

	public void start() {
		System.out.print("Enter your ID: ");
		String id = sc.nextLine();

		System.out.print("Enter your name: ");
		String username = sc.nextLine();

		this.user = new User(id, username);
		this.library = new Library();

		library.addBook(0, "Ibong Adarna", "Anonymous");
		library.addBook(1, "Florante at Laura", "Francisco Balagtas");
		library.addBook(2, "Noli Me Tangere", "Dr. Jose Rizal");
		library.addBook(3, "El Filibusterismo", "Dr. Jose Rizal");
		library.addBook(4, "Sa Mga Kuko ng Liwanag", "Edgardo M. Reyes");

		int bookID;
		String title;
		String author;
		int loanID;
		
		while (true) {
			System.out.println("\n========= OPTIONS =========");
			System.out.println("[1] Display All Books");
			System.out.println("[2] Display Available Books");
			System.out.println("[3] Display Borrowed Books");
			System.out.println("[4] Borrow Book");
			System.out.println("[5] Return Book");
			System.out.println("[6] Add Book");
			System.out.println("[7] Remove Book");
			System.out.println("[8] Update Book");
			System.out.println("[0] Exit");
			System.out.print("\nSelect Option: ");

			int option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("\n========= ALL BOOKS =========");
				library.displayAllBooks();
				break;
			case 2:
				System.out.println("\n====== AVAILABLE BOOKS ======");
				library.displayAvailableBooks();
				break;
			case 3:
				System.out.println("\n====== BORROWED BOOKS ======");
				library.displayBorrowedBooks();
				break;
			case 4:
				System.out.println("\n======== BORROW BOOK =======");
				library.displayAvailableBooks();

				System.out.print("\nEnter Book ID to borrow: ");
				bookID = sc.nextInt();
				sc.nextLine();

				System.out.print("\nEnter Loan ID to borrow: ");
				loanID = sc.nextInt();
				sc.nextLine();

				if (library.borrowBook(bookID, user, loanID)) {
					System.out.println("\nBorrowed successfully!");
				} else {
					System.out.println("\nUnable to borrow!");
				}
				break;
			case 5:
				System.out.println("\n======== RETURN BOOK =======");
				library.displayBorrowedBooks();

				System.out.print("\nEnter Loan ID to return: ");
				loanID = sc.nextInt();
				sc.nextLine();

				if (library.returnBook(loanID)) {
					System.out.println("\nReturned successfully!");
				} else {
					System.out.println("\nUnable to return!");
				}
				break;
			case 6:
				System.out.println("\n========= ADD BOOK ==========");

				System.out.print("Enter Book ID: ");
				bookID = sc.nextInt();
				sc.nextLine();

				System.out.print("Enter Book Title: ");
				title = sc.nextLine();

				System.out.print("Enter Book Author: ");
				author = sc.nextLine();

				if (library.addBook(bookID, title, author)) {
					System.out.println("\nBook added successfully!");
				} else {
					System.out.println("\nUnable to add book!");
				}
				break;
			case 7:
				System.out.println("\n======== REMOVE BOOK =======");
				library.displayAllBooks();
				
				System.out.print("\nEnter Book ID to remove: ");
				bookID = sc.nextInt();
				sc.nextLine();

				if (library.removeBook(bookID)) {
					System.out.println("\nBook removed successfully!");
				} else {
					System.out.println("\nUnable to remove book!");
				}
				break;
			case 8:
				System.out.println("\n======== UPDATE BOOK =======");
				library.displayAllBooks();
				
				System.out.print("\nEnter Book ID to update: ");
				bookID = sc.nextInt();
				sc.nextLine();

				System.out.print("Update Book Title (leave blank to keep current): ");
				title = sc.nextLine();

				System.out.print("Update Book Author (leave blank to keep current): ");
				author = sc.nextLine();
				
				if (library.updateBook(bookID, title, author)) {
					System.out.println("\nBook updated successfully!");
				} else {
					System.out.println("\nUnable to update book!");
				}
				break;
			case 0:
				System.out.println("\nLibrary closed.");
				return;
			default:
				System.out.println("\nInvalid option!");
			}
		}
	}
}
