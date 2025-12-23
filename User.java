package ph.com.bpi.hello.group.project4v2;
public class User {
	private String name;
	private Loan[] loans = new Loan[5];
	private int loanCount = 0;
	private int id =0;
	
	public User() {
		
	}
	public User(String name, int id) {
		this.name = name;
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}

	public String getName() {
		return name;
	}

	public boolean canBorrow() {
		return loanCount < 5;
	}

	public void addLoan(Loan loan) {
		loans[loanCount] = loan;
		loanCount++;
	}

	public void removeLoan(Book book) {
		for (int c = 0; c < loanCount; c++) {
			if (loans[c].getBook() == book) {
				// shift left
				for (int y = c; y < loanCount - 1; y++) {
					loans[y] = loans[y + 1];
				}
				
				loans[loanCount - 1] = null;
				loanCount--;
				break;
			}
		}
	}
}