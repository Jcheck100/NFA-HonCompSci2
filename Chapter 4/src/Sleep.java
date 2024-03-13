import java.util.Scanner;
import java.text.NumberFormat;
public class Sleep {

	public static void main(String[] args) {
		int userBirthYear;
		int userBirthMonth;
		int userBirthDay;
		int yearCurrent;
		int monthCurrent;
		int dayCurrent;
		int day;
		int year;
		int month;
		int timeAlive;
		int timeAsleep;
		NumberFormat bigNumber = NumberFormat.getNumberInstance();
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter your birthday");
		System.out.print("Year: ");
		userBirthYear = input.nextInt();
		System.out.print("Month: ");
		userBirthMonth = input.nextInt();
		System.out.print("Day: ");
		userBirthDay = input.nextInt();
		System.out.println("Enter the Current Day");
		System.out.print("Year: ");
		yearCurrent = input.nextInt();
		System.out.print("Month: ");
		monthCurrent = input.nextInt();
		System.out.print("Day: ");
		dayCurrent = input.nextInt();
		
		
		year = yearCurrent - userBirthYear;
		month = monthCurrent - userBirthMonth;
		day = dayCurrent - userBirthDay;
		
		timeAlive = (year*365) + (month*30) + day;
		timeAsleep = timeAlive*8;
		
		System.out.println("You've been alive for: "+ bigNumber.format(timeAlive) + " Days");
		System.out.println("You've been asleep for: "+ bigNumber.format(timeAsleep) + " hours");
				
		input.close();
		
		
		
		
		

	}

}
