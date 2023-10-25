import java.text.NumberFormat;
import java.util.Scanner;
public class CompoundIntrestP2 {
	public static void main(String[] args) {
		double totalValue;
		double principal;
		double timesCompound;
		double numYears;
		double intRate;
		double numerator;
		double denominator;

		
		Scanner input = new Scanner(System.in);
		NumberFormat bigNumber = NumberFormat.getNumberInstance();
		
		
		System.out.println("Enter your investment info:");
		System.out.print("Future Value: ");
		totalValue = input.nextInt();
		System.out.print("Principal: ");
		principal = input.nextInt();
		System.out.print("Times Compounded: ");
		timesCompound = input.nextInt();
		System.out.print("Intrest Rate: ");
		intRate = input.nextDouble();
		input.close();
		
		
		numerator = Math.log10(totalValue/principal);
		denominator = (timesCompound * Math.log10(1+intRate/timesCompound));
		
		numYears = numerator/denominator;
		System.out.println ();
		System.out.println ("The number of years for your inital investment to reach the final value is: " + bigNumber.format(numYears));
	}
}
