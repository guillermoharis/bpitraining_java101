package GroupProject;

public class Loan {
	private User user;
	private Book book;
	
	public Loan(Book book, User user) {
		this.book = book;
		this.user = user;
	}
	
	public Book getBook() {
		return book;
	}
	
	public User getUser() {
		return user;
	}
}
