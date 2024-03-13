/*John Heck
 * 9/22/2023
 * Grades
 */

import java.util.Scanner;
public class Grades {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
	int gradeOne;
	int gradeTwo;
	int gradeThree;
	int gradeFour;
	int gradeFive;
	int avgGrade;
	
	System.out.print("Please input 5 grades:\n");
	
	
	gradeOne = input.nextInt();
	
	gradeTwo = input.nextInt();
	
	gradeThree = input.nextInt();
	
	gradeFour = input.nextInt();
	
	gradeFive = input.nextInt();
	
	avgGrade = (gradeOne + gradeTwo + gradeThree + gradeFour + gradeFive)/(5);
	
	
	System.out.print("The average is: " + avgGrade);
	
	input.close();
	
	


	
		
		

	}

}
