import java.text.NumberFormat;
import java.util.Scanner;
public class CollegeCalculator {

	public static void main(String[] args) {
		int tuition;
		int books;
		int roomAndBoard;
		int scholarships;
		int grants;
		int finalCost;
		int originalCost;
		int extraMoney;
		String prompt = ("Please input the cost of ");
		NumberFormat bigNumber = NumberFormat.getNumberInstance();
		Scanner input = new Scanner (System.in);
		
		System.out.print (prompt + "tuition: ");
		tuition = input.nextInt();
		
		System.out.print (prompt + "books: ");
		books = input.nextInt();
		
		System.out.print (prompt + "room and board: ");
		roomAndBoard = input.nextInt();
		
		System.out.print (prompt + "scholarships: ");
		scholarships = input.nextInt();
		
		System.out.print (prompt + "grants: ");
		grants = input.nextInt();
		
		originalCost = tuition + books + roomAndBoard;
		extraMoney = scholarships + grants;
		
		finalCost = originalCost - extraMoney;
		
		System.out.print("The cost of your education is: " + bigNumber.format(finalCost) + "$");
		
		
		input.close();

	}

}
