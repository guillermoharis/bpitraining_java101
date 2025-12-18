
/**
 * 
 */
package ph.com.bpi.hello.group;
import java.util.Scanner;

/**
 * Class group
 * 
 * GROUP PROJECT
	Objective: Apply Basic Java learning
	Create a console-based Student Grade Management System
	The system must allow the user to perform the following actions:
	1. Input student details
	2. Input number of subjects
	3. Input grades per subject
	4. Compute average grades of all subjects
	5. Determine if grade is pass or fail
	Student details must contain the following information:
	- Student name
	- Student ID
	- Number of subjects
	- Grades for each subject
	
	*Rename the class – Class names should always start with a capital letter or follow PascalCase.
	*For Option B, it's better if it also has its own method.
	**Optional (Bonus): Input Validation
	*Number of subjects should be > 0
	*Grades should be between 0–100
 
 */
public class Group3Project {
	
	static String studentName="";
	static int studentId = 0;
	static int numOfSubjects=1;
	static double[] grades = null;
    static double average = 0.0;
    static String status = "";
	
	//main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		char choice = ' ';
		while (choice != 'D') {
			/*
			 *  ===== STUDENT GRADING SYSTEM =====
				A - Add Student Information
				B - Compute Student Average
				C - Display Student Information
				D - Exit
			 */
			showMenu();

			System.out.print("Enter choice: ");
			
			choice =input.next().charAt(0);
			
			switch(choice) {
			case 'A':
				/*
				 *  Enter choice: A
					Enter student name: JUAN DELA CRUZ
					Enter student ID: 20251124
					Enter number of subjects: 2
					Enter grade for subject 1: 90
					Enter grade for subject 2: 87
				 	===== STUDENT SAVED =====
				 */
			addStudent(input);
			   break;
			case 'B':
				/*
				 *  ===== STUDENT GRADING SYSTEM =====
					A - Add Student Information
					B - Compute Student Average
					C - Display Student Information
					D - Exit
					Enter choice: B
					Average: 88.5
					Status: PASS
				 */
				computeStudentAverage();
			       
                   break;
			case 'C':
				/*
				 * 	Enter choice: C

					===== STUDENT SUMMARY =====
					Student Name: JUAN DELA CRUZ
					Student ID: 20251124
					Average Grade: 88.5
					Status: PASS
					===========================
				 */
				studentInfo();
                break;
		 
			case 'D':
				System.out.println("Exited...");
                break;
			 
			default:
				 System.out.println("choice is A,B,C,D only...");
			}
		}
		
		input.close();

	}
	//end main method
 

	//show menu method
	static void showMenu() {
		System.out.println("===== STUDENT GRADING SYSTEM =====");
		System.out.println("A - Add Student Information");
		System.out.println("B - Compute Student Average");
		System.out.println("C - Display Student Information");
		System.out.println("D - Exit");
		System.out.println("");
	}
	//end show menu method
	
	//add student method
	static void addStudent(Scanner input) {
		/*
		 *  Enter choice: A
			Enter student name: JUAN DELA CRUZ
			Enter student ID: 20251124
			Enter number of subjects: 2
			Enter grade for subject 1: 90
			Enter grade for subject 2: 87
			===== STUDENT SAVED =====
		 * 
		 */
		System.out.print("Enter student name: ");
        input.nextLine();
        studentName = input.nextLine();

        System.out.print("Enter student ID: ");
        studentId = input.nextInt();

        //Number of subjects should be > 0
        System.out.print("Enter number of subjects: ");
        int count = input.nextInt();
        
        if (count>0){
        	grades = new double[count];

            for (int i = 0; i < count; i++) {
                System.out.print("Enter grade for subject " + (i + 1) + ": ");
                //Grades should be between 0–100
                double gradeInput = input.nextDouble();
                if (gradeInput >=0 && gradeInput<=100) {
                	grades[i] = gradeInput;
                }
                else
                {
                	System.out.println("Grades should be between 0–100");
                	break;
                }
            }

            System.out.println("===== STUDENT SAVED =====");
	
        }
        else {
        	System.out.println("Number of subjects should be greater than zero.");
        	
        }
        
	}
	//end add student method
	
	//compute student method
	
	//end compute student method
	
	 static double studentAverage(double[] grades) {
	        double sum = 0;

	        for (double grade : grades) {
	              sum += grade;
	          }

	        return sum / grades.length;
	    }
	 
	 static String avgStatus(double avg) {
	        return (avg >= 75) ? "PASS" : "FAIL";
	    } 
	
	 static void computeStudentAverage() {
		 if (grades == null) {
	    	   System.out.println("Please input student data first.");
         } else {
             average = studentAverage(grades);
             status = avgStatus(average);
             System.out.println("Average: " + average);
             System.out.println("Status: " + status);
         }
	 }
	//student info method
	 static void studentInfo() {
	        if (grades == null) {
	            System.out.println("Please input student data first.");
	            return;
	        }

	        System.out.println("\n===== STUDENT SUMMARY =====");
	        System.out.println("Student Name: " + studentName);
	        System.out.println("Student ID: " + studentId);
	        System.out.println("Average Grade: " + average);
	        System.out.println("Status: " + status);
	        System.out.println("===========================");
	 }//end student info method
	
} // end group class

