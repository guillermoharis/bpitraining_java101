package GroupProject;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> books = new ArrayList<>();
	private List<Loan> loans = new ArrayList<>();

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public boolean addBook(int bookID, String title, String author) {
		for (Book b : books) {
			if (b.getID() == bookID) {
				System.out.println("\nBook ID already used!");
				return false;
			}
		}

		Book book = new Book(bookID, title, author);
		books.add(book);

		return true;
	}

	public boolean removeBook(int bookID) {
		for (Loan l : loans) {
			if (l.getBook().getID() == bookID) {
				loans.remove(l);
				break;
			}
		}
		
		for (Book b : books) {
			if (b.getID() == bookID) {	
				books.remove(b);
				return true;
			}
		}

		System.out.println("\nInvalid Book ID!");
		return false;
	}

	public boolean updateBook(int bookID, String title, String author) {
		for (Loan l : loans) {
			if (l.getBook().getID() == bookID) {
				System.out.println("\nBook is currently borrowed!");
				return false;
			}
		}
		
		for (Book b : books) {
			if (b.getID() == bookID) {
				if (title.trim().length() > 0) {
					b.setTitle(title);
				}

				if (author.trim().length() > 0) {
					b.setAuthor(author);
				}

				return true;
			}
		}

		System.out.println("\nInvalid Book ID!");
		return false;
	}

	public boolean borrowBook(int bookID, User user, int loanID) {
		int bookIndex = -1;

		for (Book b : books) {
			if (b.getID() == bookID) {
				bookIndex = books.indexOf(b);
				if (b.isBorrowed()) {
					System.out.println("\nBook already borrowed!");
					return false;
				}
			}
		}

		if (bookIndex < 0) {
			System.out.println("\nInvalid Book ID!");
			return false;
		}

		Book book = books.get(bookIndex);

		for (Loan l : loans) {
			if (l.getID() == loanID) {
				System.out.println("\nLoan ID already used!");
				return false;
			}
		}

		Loan loan = new Loan(book, user, loanID);
		loans.add(loan);

		book.setBorrowed(true);

		return true;
	}

	public boolean returnBook(int loanID) {
		for (Loan l : loans) {
			if (l.getID() == loanID) {
				loans.remove(l);

				Book book = l.getBook();
				book.setBorrowed(false);

				return true;
			}
		}

		System.out.println("\nInvalid Loan ID!");

		return false;
	}

	public void displayAllBooks() {
		for (Book book : books) {
			System.out.println("Book ID: " + book.getID() + " - " + book.getTitle() + " by " + book.getAuthor());
		}
	}

	public void displayAvailableBooks() {
		for (Book book : books) {
			if (!book.isBorrowed()) {
				System.out.println("Book ID: " + book.getID() + " - " + book.getTitle() + " by " + book.getAuthor());
			}
		}

	}

	public void displayBorrowedBooks() {
		for (Loan loan : loans) {
			System.out.println("Loan ID: " + loan.getID() + " - " + loan.getBook().getTitle() + " (Borrowed by: "
					+ loan.getUser().getID() + " - " + loan.getUser().getName() + ")");
		}

	}
}