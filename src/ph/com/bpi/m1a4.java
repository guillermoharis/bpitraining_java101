package ph.com.bpi;
import java.util.Scanner;

public class m1a4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		
		int age = input.nextInt();
		String range;
		
		if (age < 18)
			range = "Minor";
		else if (age > 59)
			range = "Senior";
		else
			range = "Adult";
		
		System.out.print(range);

	}

}