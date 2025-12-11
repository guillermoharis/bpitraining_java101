package ph.com.bpi;

public class m2a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book = new Book();
		House house = new House();
		Tree tree = new Tree();
		
		book.title = "Chicken Soup";
		book.page = 300;
		book.bookdetail();
		
		house.address = "Valenzuela";
		house.houseno = 251;
		house.housedetail();
			
		tree.treetype = "Malunggay";
		tree.treeheight = 18;
		tree.treedetail();
	}

}
