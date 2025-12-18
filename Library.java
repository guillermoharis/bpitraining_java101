package ph.com.bpi.hello.group.project2;

public class Library {
   // can contain up to 5 books	
	private Book[] books = new Book[5];
	
	public Library() {
		
	}
	
	public Library(Book[] books) {
		setBooks(books);
	}
	
	public Book[] getBooks() {
		return books;
	}
	
	public void setBooks(Book[] books) {
		this.books=books;
	}

}
