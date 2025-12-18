package ph.com.bpi.hello.group.project3;

import java.util.Scanner;


public class InputValidation {

    private static Scanner scanner = new Scanner(System.in);
	public static int getIntInput(String prompt) {
        int value;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                scanner.nextLine(); // consume newline
                return value;
            } else {
                System.out.println("Invalid input. Enter a number.");
                scanner.nextLine(); // clear invalid input
            }
        }
    }

}
