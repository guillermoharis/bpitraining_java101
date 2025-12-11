package ph.com.bpi;

public class Car extends Vehicle implements Refuable {
	public Car(int numberOfWheels, String brand) {
		super(numberOfWheels, brand);
	}


    @Override
    void startEngine() {
    	System.out.println("Starting Car...");
        System.out.println(this + " engine started!");
    }
    
    @Override
    public void refuel() {
    	System.out.println("Refueling Car...");
    	System.out.println(this + " refueld!");
    }

}
