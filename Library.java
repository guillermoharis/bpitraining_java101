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

	public boolean borrowBook(int index, User user, int loanID) {
		boolean loanExist = false;

		if (index < 0 || index >= bookCount) {
			return false;
		}

		Book book = books[index];

		if (book.isBorrowed()) {
			System.out.println("\nBook already borrowed!");
			return false;
		}

		if (!user.canBorrow()) {
			return false;
		}

		for (int c = 0; c < loanCount; c++) {
			if (loans[c].getID() == loanID) {
				loanExist = true;
				break;
			}
		}

		if (loanExist) {
			System.out.println("\nLoan ID already used!");
			return false;
		}

		Loan loan = new Loan(book, user, loanID);
		loans[loanCount] = loan;
		loanCount++;

		book.setBorrowed(true);
		user.addLoan(loan);

		return true;
	}

	public boolean returnBook(int returnID, User user) {
		int index = 0;
		boolean isLoan = false;

		for (int c = 0; c < loanCount; c++) {
			if (loans[c].getID() == returnID) {
				index = loans[c].getBook().getID();
				isLoan = true;
				break;
			}
		}

		if (!isLoan) {
			return false;
		}

		Book book = books[index];

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
		for (int c = 0; c < bookCount; c++) {
			System.out.println(
					"Book ID: " + books[c].getID() + " - " + books[c].getTitle() + " by " + books[c].getAuthor());
		}
	}

	public void displayAvailableBooks() {
		System.out.println("\n====== AVAILABLE BOOKS ======");
		for (int c = 0; c < bookCount; c++) {
			if (!books[c].isBorrowed()) {
				System.out.println(
						"Book ID: " + books[c].getID() + " - " + books[c].getTitle() + " by " + books[c].getAuthor());
			}
		}
	}

	public void displayBorrowedBooks() {
		System.out.println("\n====== BORROWED BOOKS ======");
		for (int c = 0; c < loanCount; c++) {
			Loan loan = loans[c];
			System.out.println("Loan ID: " + loan.getID() + " - " + loan.getBook().getTitle() + " (Borrowed by: "
					+ loan.getUser().getName() + ")");
		}
	}
}
