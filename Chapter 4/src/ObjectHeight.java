import java.util.Scanner;
public class ObjectHeight {

	public static void main(String[] args) {
		double userInput;
		double finalHeight;
		String prompt = ("Enter a time less than 4.5: ");
		String end = ("The height of the object is: ");
		Scanner input = new Scanner(System.in);
		
		System.out.print(prompt);
		userInput = input.nextDouble();
		
		finalHeight = 100-4.9*userInput*2;
		
		System.out.print(end + finalHeight + "m");
		input.close();
	}

}
