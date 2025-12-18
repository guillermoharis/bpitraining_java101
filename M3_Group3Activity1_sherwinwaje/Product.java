package ph.com.bpi.hello.group.project3;

public class  Product {
	
	// Product class
	    private String name;
	    private double price;

	    public Product(String name, double price) {
	        this.name = name;
	        this.price = price;
	    }

	    public String getName() {
	    	return name; 
	    }
	    
	    public double getPrice() { 
	    	return price; 
	    }
	    
	    @Override
	    public String toString() {
             return name + " (Price: " + price + ")";
       }     
	    
}// End of Product class



