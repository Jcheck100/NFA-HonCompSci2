import java.text.NumberFormat;
import java.util.Scanner;

public class GradesPart2 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double avgGrade= 0;
	NumberFormat percent = NumberFormat.getPercentInstance();
	System.out.print("Please input 5 grades as whole numbers:\n");
	
	avgGrade += input.nextDouble();
	avgGrade += input.nextDouble();
	avgGrade += input.nextDouble();
	avgGrade += input.nextDouble();
	avgGrade += input.nextDouble();
	avgGrade = avgGrade/100;
	avgGrade = (avgGrade/5);

	System.out.print("The avg is: " + percent.format(avgGrade));
	input.close();
	}
}
