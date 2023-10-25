import java.text.NumberFormat;
import java.util.Scanner;
public class CompoundIntrest {
	public static void main(String[] args) {
		int totalValue;
		double principal;
		int timesCompound;
		int numYears;
		double intRate;

		
		Scanner input = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		
		System.out.println("Enter your investment info:");
		System.out.print("Future Value: ");
		totalValue = input.nextInt();
		System.out.print("Times Compounded: ");
		timesCompound = input.nextInt();
		System.out.print("Years invested: ");
		numYears = input.nextInt();
		System.out.print("Intrest Rate(decimal format): ");
		intRate = input.nextDouble();
		input.close();
		
		
		double denominator = Math.pow(1+(intRate/timesCompound),(numYears * timesCompound));
		principal =  (totalValue/denominator);
			
		
		System.out.println ("The inital value needed to invest is: " + money.format(principal));
	}
}

