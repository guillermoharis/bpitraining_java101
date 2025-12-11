package ph.com.bpi;

public class Excercise1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		
		car1.setBrand("Mazda");
		car1.setModel("3");
		car1.setColor("Soul Red Crystal");
		car1.setYear(2018);
		
	    Car car2 = new Car("Mazda", "CX-8", "Machine Grey", 2026);
		
		
		System.out.println("Car 1" + "\n" + car1.output());
	    System.out.println("Car 2" + "\n" + car2.output());
	}

}
