/*John Heck
 * 9/20/2023
 * Digits of a Number*/

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
	int userNumber;
	int onesPlace;
	int tensPlace;
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Please enter a two digit number: ");
	userNumber = input.nextInt();
	
	tensPlace = userNumber / 10;
	System.out.print("Tens: " + tensPlace + "\n");
	
	onesPlace = userNumber%10;
	System.out.print("Ones: " + onesPlace + "\n");
	
	input.close();
	}

}
