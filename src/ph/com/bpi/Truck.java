package ph.com.bpi;

public class Truck extends Vehicle implements Refuable {
	public Truck(int numberOfWheels, String brand) {
		super(numberOfWheels, brand);
	}


    @Override
    void startEngine() {
    	System.out.println("Starting Truck...");
        System.out.println(this + " engine started!");
    }
    
    @Override
    public void refuel() {
    	System.out.println("Refueling Truck...");
    	System.out.println(this + "Truck refueld!");
    }

}
