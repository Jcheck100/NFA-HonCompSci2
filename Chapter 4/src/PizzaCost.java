import java.util.Scanner;
import java.text.NumberFormat;
public class PizzaCost {

	public static void main(String[] args) {
		final double LABOR = .75;
		final double RENT = 1.00;
		double diameter;
		double materials;
		double cost;
		NumberFormat dollars = NumberFormat.getCurrencyInstance();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the diameter of the pizza: ");
		diameter = input.nextDouble();
		
		materials = (.05*diameter*diameter);
		
		cost = materials + LABOR + RENT;
		
		System.out.print("The cost of the pizza is: " + dollars.format(cost));
	
		input.close();
	}

}
