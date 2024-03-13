import java.util.Scanner;
public class Energy {

	public static void main(String[] args) {
		double mass;
		double energy;
		double bulb;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a mass (kg): ");
		mass = input.nextDouble();
		
		energy = mass * ((3.0 * 100000000)*(3*100000000));
		bulb = energy/360000;
		
		System.out.println("The energy in joules is: " + energy);
		System.out.println("The amount of 100 Watt light bulbs that can be powered is: " + bulb);
		input.close();
	}

}
