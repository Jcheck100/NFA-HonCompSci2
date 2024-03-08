import java.util.*;

public class DigitsDisplay{
    public static void main(String[] args) {
        Scanner userInput = new Scanner (System.in);
        int userNumber;
        System.out.println("Ener a number:");
		userNumber = userInput.nextInt();
		userInput.close();

		while (userNumber >= 1) {
			System.out.println(userNumber % 10);
			userNumber /= 10;
    }
}
}