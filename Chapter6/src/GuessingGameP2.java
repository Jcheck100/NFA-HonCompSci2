import java.util.*;

public class GuessingGameP2 {
    public static void main(String[] args) {
        int userNumber;
        int randomNumber;

        Random tempRandomNumber = new Random();
        final int max = 20;
        final int min = 1;
        Scanner input = new Scanner(System.in);
        randomNumber = tempRandomNumber.nextInt(max - min + 1) + min;

        do {
            do {
                System.out.println("Please enter a number between 1 and 20: ");
                userNumber = input.nextInt();
            } while (userNumber < min || userNumber > max);

            if (userNumber != randomNumber) {
                System.out.println("Try again");
            } else {
                System.out.println("You Win");
            }
        } while (userNumber != randomNumber);
        input.close();
    }
}