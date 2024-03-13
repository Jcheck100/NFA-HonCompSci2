/*John Heck
 * 9/20/2023
 * Distance P.2*/

import java.text.NumberFormat;
import java.util.Scanner;

public class DistancePart2 {
	


	public static void main(String[] args) {
		String name;
		double Segment1;
		double Segment2;
		double Segment3;
		double totalDistance;
		NumberFormat bigNumber = NumberFormat.getNumberInstance();
		
		String prompt1 = "Enter the distance of segment";
		String Prompt2 = "What is the racers name: ";
		
		
		Scanner RacerName = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		
		//Get Inputs
		System.out.print(prompt1 + " 1(km): ");
		Segment1 = input.nextDouble();
		
		System.out.print(prompt1 + " 2(km): ");
		Segment2 = input.nextDouble();
		
		System.out.print(prompt1 + " 3(km): ");
		Segment3 = (input.nextDouble());
		
		totalDistance =(Segment1 + Segment2 + Segment3);
		
		System.out.print(Prompt2);
		name = RacerName.nextLine();
		
		//Print Added Inputs and Name	
		System.out.println(name + " Traveled: " + bigNumber.format(totalDistance)+ "(km)");
	
		input.close();
		RacerName.close();
		
	}

}
