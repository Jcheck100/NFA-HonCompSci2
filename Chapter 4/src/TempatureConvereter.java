/*John Heck
 * 9/20/2023
 * TempConverter*/

import java.util.Scanner;

public class TempatureConvereter {
	public static void main(String[] args) {
		Double userInput;
		Double celciusConversion;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please input a temperature in farenheight: ");
		userInput = input.nextDouble();
		
		celciusConversion =((userInput - 32)*((double)5/(double)9));	
		
		int celciusConversion2 = (int)(celciusConversion*100);
		Double celciusConversion3 = (double)(celciusConversion2)/100;
		
		System.out.print(celciusConversion3);
		input.close();
	}
	
}
