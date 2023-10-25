import java.util.Scanner;
public class CircleCircumference {

	public static void main(String[] args) {
		double radius;
		double circumference;
		final double PI = 3.14;
		String prompt =("Please input the radius of the circle: ");
		Scanner input = new Scanner(System.in);
		
		
		System.out.print(prompt);
		radius = input.nextDouble();
		
		
		circumference = 2*PI*radius;
		int circumference2 = (int)(circumference*100);
		Double circumference3= (double)(circumference2)/100;
		
		if (circumference3 >= 0){
			System.out.print(circumference3);
	}
		else
			System.out.print("Negative radii are not allowed");

	}

}
