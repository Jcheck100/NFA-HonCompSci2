import java.util.Scanner;
public class Change {
	public static void main(String[] args) {
		double pennies;
		double nickels;
		double dimes;
		double quarters;
		double changeDue;
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please input the change in cents: ");
		changeDue = input.nextDouble();
		
		quarters = ((int)changeDue / 25);
		dimes = (((int)changeDue % 25)/10);
		nickels = ((((int)changeDue % 25) % 10) / 5);
		pennies = (((((int)changeDue % 25) % 10) % 5));
		
		System.out.println("Pennies due: " + pennies);
		System.out.println("Nickels due: " + nickels);
		System.out.println("Dimes due: " + dimes);
		System.out.println("Quarters due: " + quarters);
		
		
		
		input.close();
		
		
	}
}
