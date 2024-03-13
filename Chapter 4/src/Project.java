import java.text.NumberFormat;
import java.util.Scanner;
public class Project {

	public static void main(String[] args) {
		Double designing;
		Double coding;
		Double debugging;
		Double testing;
		Double total;
		Double designPercent;
		Double codePercent;
		Double debugPercent;
		Double testPercent;
		Scanner input = new Scanner(System.in);
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		System.out.print("Please input the number of hours spent on each task \n");
		System.out.print("Designing: ");
		designing = input.nextDouble();
		System.out.print("Coding: ");
		coding = input.nextDouble();
		System.out.print("Debugging: ");
		debugging = input.nextDouble();
		System.out.print("Testing: ");
		testing = input.nextDouble();
		
		total = designing + coding + debugging + testing;
		
		designPercent = designing/total;
		codePercent = coding/total;
		debugPercent = debugging/total;
		testPercent = testing/total;
		
		System.out.println();
		System.out.print ( "Task               % \n"); //Weird Error if I use format, don't know why
		System.out.format ("%-10s %12s", "Designing",  percent.format(designPercent)+"\n");
		System.out.format ("%-10s %12s", "Coding",  percent.format(codePercent)+"\n");
		System.out.format ("%-10s %12s", "Debugging",  percent.format(debugPercent)+"\n");
		System.out.format ("%-10s %12s", "Testing", percent.format(testPercent)+"\n");
		input.close();
	}

}
