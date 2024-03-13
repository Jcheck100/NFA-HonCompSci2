import java.text.NumberFormat;
import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		double principal;
		double numYears;
		double intRate;
		double totalMoney;
		String prompt = ("Please enter the");
		NumberFormat dollars = NumberFormat.getCurrencyInstance();
		Scanner input = new Scanner(System.in);
		System.out.print(prompt + " principal: ");
		principal = input.nextDouble();
		System.out.print(prompt + " Number of Years: ");
		numYears = input.nextDouble();
		System.out.print(prompt + " Intrest Rate : ");
		intRate = input.nextDouble();
		
		totalMoney = principal *(1 + numYears * intRate);
		System.out.print ("The total value after the term is: " + dollars.format(totalMoney));
		input.close();
	}

}
