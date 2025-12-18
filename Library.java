package GroupProject;

public class Library {
	private Book[] books = new Book[5];
	private int bookCount = 0;

	private Loan[] loans = new Loan[5];
	private int loanCount = 0;

	public void addBook(Book book) {
		if (bookCount < 5) {
			books[bookCount] = book;
			bookCount++;
		}
	}

	public boolean borrowBook(int index, User user) {
		if (index < 0 || index >= bookCount) {
			return false;
		}

		Book book = books[index];

		if (book.isBorrowed()) { 
			return false;
		}
		
		if (!user.canBorrow()) { 
			return false;
		}

		Loan loan = new Loan(book, user);
		loans[loanCount] = loan;
		loanCount++;

		book.setBorrowed(true);
		user.addLoan(loan);

		return true;
	}

	public boolean returnBook(int index, User user) {
		if (index < 0 || index >= bookCount) {
			return false;
		}

		Book book = books[index];
		if (!book.isBorrowed()) {
			return false;
		}

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

		user.removeLoan(book);

		book.setBorrowed(false);
		return true;
	}

	public void displayAllBooks() {
		System.out.println("\n========= ALL BOOKS =========");
		System.out.println("ID - DETAILS");
		for (int c = 0; c < bookCount; c++) {
			System.out.println(" " + books[c].getID() + " - " + books[c].getTitle() + " by " + books[c].getAuthor());
		}
	}

	public void displayAvailableBooks() {
		System.out.println("\n====== AVAILABLE BOOKS ======");
		System.out.println("ID - DETAILS");
		for (int c = 0; c < bookCount; c++) {
			if (!books[c].isBorrowed()) {
				System.out.println(" " + books[c].getID() + " - " + books[c].getTitle() + " by " + books[c].getAuthor());
			}
		}
	}

	public void displayBorrowedBooks() {
		System.out.println("\n====== BORROWED BOOKS ======");
		System.out.println("ID - DETAILS");
		for (int c = 0; c < loanCount; c++) {
			Loan loan = loans[c];
			System.out.println(" " + loan.getBook().getID() + " - " + loan.getBook().getTitle() + " (Borrowed by: " + loan.getUser().getName() + ")");
		}
	}
}
