import java.util.Scanner;
/*John Heck
* 9/20/2023
* Digits of a Number*/	
public class DigitsPart2 {
	public static void main(String[] args) {
	int userNumber;
	int onesPlace;
	int tensPlace;
	int hundredsPlace;
		
	Scanner input = new Scanner(System.in);
		
	System.out.print("Please enter a three digit number: ");
	userNumber = input.nextInt();
		
		hundredsPlace = userNumber / 100;
	System.out.print("Hundreds: " + hundredsPlace + "\n");
	
		tensPlace = ((userNumber%100)/10);
	System.out.print("Tens: " + tensPlace + "\n");
	
	onesPlace = userNumber % 10;
	System.out.print("Ones: " + onesPlace + "\n");
		

	

		
		
	input.close();
		}

	}


