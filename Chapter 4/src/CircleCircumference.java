import java.util.Scanner;
public class CircleCircumference {

	public static void main(String[] args) {
		double radius;
		double circumference;
		String prompt =("Please input the radius of the circle: ");
		Scanner input = new Scanner(System.in);
		
		
		System.out.print(prompt);
		radius = input.nextDouble();

		
		
		if (radius >= 0){
			circumference = (2*Math.PI*radius);
		int circumference2 = (int)(circumference*100);
		Double circumference3= (double)(circumference2)/100;
			System.out.print(circumference3);
	}
		else

			System.out.print("Negative radii are not allowed");
			input.close();
	}

}
