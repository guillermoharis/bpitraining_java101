package ph.com.bpi.hello.group.project4v2;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> books2 = new ArrayList<>();
	// private Book[] books = new Book[5];
	// private int bookCount = 0;

	// private Loan[] loans = new Loan[5];
	private List<Loan> loans = new ArrayList<>();
	// private int loanCount = 0;

	/*
	 * public void addBook(Book book) { if (bookCount < 5) { books[bookCount] =
	 * book; bookCount++; } }
	 */

	public List<Book> getBooks() {
		return books2;
	}

	public void setBooks(List<Book> books2) {
		this.books2 = books2;
	}

	public void addBook(Book book) {

		books2.add(book);

	}

	public boolean borrowBook(int index, User user) {
		// if (index < 0 || index >= bookCount) {
		// return false;
		// }

		// Book book = books2.contains(user.getId());

		Book book = null;
		for (Book b : books2) {
			if (b.getID() == index) {
				book = b;
				break;
			}
		}

		if (book.isBorrowed()) {
			return false;
		}

		if (!user.canBorrow()) {
			return false;
		}

		Loan loan = new Loan(book, user);
		loans.add(loan);
		// loanCount++;

		book.setBorrowed(true);
		user.addLoan(loan);

		return true;
	}

	public boolean returnBook(int index, User user) {
		// if (index < 0 || index >= bookCount) {
		// return false;
		// }

		// Book book = books[index];
		 

		Book book = books2.get(index);
		
		if (!book.isBorrowed()) {
			return false;
		}

		// remove from library loans
		/*
		for (int c = 0; c < loanCount; c++) {
			if (loans[c].getBook() == book) {
				for (int y = c; y < loanCount - 1; y++) {
					loans[y] = loans[y + 1];
				}

				loans[loanCount - 1] = null;
				loanCount--;
				break;
			}
		}
		*/
		 
		loans.removeIf(loan -> loan.getBook() == book);


		for (Loan loan : loans) {
			if (loan.getBook() == book) {
				break;
			}
		}

		user.removeLoan(book);

		book.setBorrowed(false);
		return true;
	}

	public void displayAllBooks(List<Book> books2) {
		System.out.println("\n========= ALL BOOKS =========");
		System.out.println("ID - DETAILS");
		/*
		 * for (int c = 0; c < bookCount; c++) { System.out.println(" " +
		 * books[c].getID() + " - " + books[c].getTitle() + " by " +
		 * books[c].getAuthor()); }
		 */
		for (Book book : books2) {
			System.out.println(" " + book.getID() + " - " + book.getTitle() + " by " + book.getAuthor());
		}
	}

	public void displayAvailableBooks() {
		System.out.println("\n====== AVAILABLE BOOKS ======");
		System.out.println("ID - DETAILS");
		/*
		 * for (int c = 0; c < bookCount; c++) { if (!books[c].isBorrowed()) {
		 * System.out .println(" " + books[c].getID() + " - " + books[c].getTitle() +
		 * " by " + books[c].getAuthor()); } }
		 */

		for (Book book : books2) {
			if (!book.isBorrowed()) {
				System.out.println(" " + book.getID() + " - " + book.getTitle() + " by " + book.getAuthor());
			}
		}

	}

	public void displayBorrowedBooks() {
		System.out.println("\n====== BORROWED BOOKS ======");
		System.out.println("ID - DETAILS");
		/*
		for (int c = 0; c < loanCount; c++) {
			Loan loan = loans[c];
			System.out.println(" " + loan.getBook().getID() + " - " + loan.getBook().getTitle() + " (Borrowed by: "
					+ loan.getUser().getName() + ")");
		}
		*/

		for (Loan loan : loans) {
			System.out.println(" " + loan.getBook().getID() + " - " + loan.getBook().getTitle() + " (Borrowed by: "
					+ loan.getUser().getName() + ")");
		}

	}
}
