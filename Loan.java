package GroupProject;

public class Loan {
	private User user;
	private Book book;
	private int id;

	public Loan(Book book, User user, int id) {
		this.book = book;
		this.user = user;
		this.id = id;
	}

	public Book getBook() {
		return book;
	}

	public User getUser() {
		return user;
	}
	
	public int getID() {
		return id;
	}
}
