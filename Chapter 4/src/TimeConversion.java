import java.util.Scanner;
public class TimeConversion {

	public static void main(String[] args) {
		int timeMinutes;
		int timeHours;
		int timeTens;
		int timeOnes;
		Scanner input = new Scanner(System.in);
		
		System.out.print ("Enter a time in Minutes: ");
		timeMinutes = input.nextInt();
		
		timeHours = (timeMinutes/60);
		timeTens = ((timeMinutes%60)/10);
		timeOnes = ((timeMinutes%60)%10);
		
		System.out.println("The time is: " + timeHours + ":" + timeTens + timeOnes);
		input.close();
	}

}
