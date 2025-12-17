package ph.com.bpi.hello.group.project3;

public class Product {

	String name;
	double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	@Override
	public String toString() {
		return (name + " (Php " + price + ")");
	}

}
