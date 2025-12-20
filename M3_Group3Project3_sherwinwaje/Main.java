package ph.com.bpi.hello.group.project4v2;

/*

**Group Project Requirements**

**Library System Application Requirements (Updated)**

**Application behavior:**

1.  On application start:
    *   Create a **User** with a name and ID.
    *   Create a **Library** object.
    *   Initialize some **Book objects** and add them to the Library (initially 5, but library supports unlimited books stored in a **List<Book>**).

2.  Users can perform the following actions through a menu:
    *   **\[1] Display All Books** – Show all books in the library (ID, Title, Author), regardless of loan status.
    *   **\[2] Display Available Books** – Show books that are not currently borrowed.
    *   **\[3] Display All Borrowed Books** – Show books currently on loan, including the borrower's name.
    *   **\[4] Borrow Book** – User selects an available book to borrow; a Loan is created and added to the **List<Loan>**, linking the User and Book.
    *   **\[5] Return Book** – User selects a loan to return; the loan is removed from the **List<Loan>** and the book is marked available.
    *   **\[6] Add Book** – User can add a new book to the **List<Book>** by entering ID, Title, and Author. An existing id should not be allowed.
    *   **\[7] Remove Book** – User can remove a book from the **List<Book>** by ID; any associated loan is also removed from the **List<Loan>**.
    *   **\[8] Update Book** – User can update the Title and/or Author of an existing book in the **List<Book>**. Books that are currently borrowed/loaned should not be updatable.
    *   **\[0] Exit** – Stops the program.


**Rules and constraints:**

*   **Use List<Book>** to manage books.
*   **Use List<Loan>** to manage loans.
*   **Unlimited books** – The library can hold any number of books.
*   **Unlimited loans** – Any number of books can be borrowed; the system dynamically tracks loans.
*   **No Java Exception Handling** – Avoid `try-catch` blocks.
*   **Input validation** – Prevent invalid operations (e.g., borrowing a non-existent or already borrowed book).
*   **Clean code** – Use proper encapsulation, getters/setters, and clear menu formatting.

***

*highlighted in yellow are new features*

 */
public class Main {
	public static void main(String[] args) {

		LibraryApplication libraryApplication = new LibraryApplication();
		libraryApplication.start();
		
		/*
		 * 1.  On application start:
	     *   Create a **User** with a name and ID.
	     *   Create a **Library** object.
	     *   Initialize some **Book objects** and add them to the Library (initially 5, but library 
	     *   supports unlimited books stored in a **List<Book>**).

		 */
	}
}

