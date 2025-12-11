package ph.com.bpi;
import java.util.Scanner;

public class m1a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
    	System.out.println("What is your age?");
    	String age = input.nextLine();
    	
    	int ageinit = Integer.parseInt(age);
    	double agedouble = Double.parseDouble(age);
    	
    	System.out.println("Your age as integer : " + ageinit);
    	
    	System.out.println("Your age as double  : " + agedouble);

	}

}
