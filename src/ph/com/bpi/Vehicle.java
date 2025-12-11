package ph.com.bpi;

public abstract class Vehicle {
	int numberOfWheels;
	String brand;
	
	public Vehicle(int numberOfWheels, String brand) {
		this.numberOfWheels = numberOfWheels;
		this.brand = brand;
	}
	
	abstract void startEngine();
	
	void destroy() {
		System.out.println(this + " is destroyed");
	}

    @Override
    public String toString() {
        return brand + " (" + numberOfWheels + " wheels)";
    }

}
