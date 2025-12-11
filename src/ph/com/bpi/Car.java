package ph.com.bpi;

public class Car {
	
	//attributes
    private String brand;
    private String model;
    private String color;
    private int year;
    
    public Car() {
    	
    }
    
    public Car(String brand, String model, String color, int year) {
    	this.brand = brand;
    	this.model = model;
    	this.color = color;
    	this.year = year;
    }
    
    //brand
    public String getBrand() {
    	return brand;
    }
    
    public void setBrand(String brand) {
    	this.brand = brand;
    }
    
    //model
    public String getModel() {
    	return model;
    }
    
    public void setModel(String model) {
    	this.model = model;
    }
    
    //color
    public void setColor(String color) {
    	this.color = color;
    }
    
    public String getColor(String color) {
    	return color;
    }
    
    //year
    public void setYear(int year) {
    	this.year = year;
    }
    
    public int getColor(int year) {
    	return year;
    }
    
    
	public String output() {
	    return "Brand: " + brand + "\n" +
	           "Model: " + model + "\n" +
	           "Color: " + color + "\n" +
	           "Year: " + year;
	}

}
