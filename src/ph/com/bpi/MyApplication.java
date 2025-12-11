package ph.com.bpi;

public class MyApplication {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car(4, "Mazda");
		Truck truck = new Truck(18, "Isuzu");
		
		car.startEngine();
		car.refuel();
		
		truck.startEngine();
		truck.refuel();
		
		destroyVehicle(car);
		//destroyVehicle(truck);

	}
	
    public static void destroyVehicle(Vehicle v) {
        v.destroy();
        
    }

}
