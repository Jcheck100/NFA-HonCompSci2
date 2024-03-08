import java.util.*;

public class GuessingGame {
    public static void main(String[] args) {
        int userNumber;
        int randomNumber;

        Random tempRandomNumber = new Random();
        final int max = 20;
        final int min = 1;
        Scanner input = new Scanner(System.in);
        randomNumber = tempRandomNumber.nextInt(max - min + 1) + min;
        System.out.println("Please enter a number between 1 and 20: ");
        userNumber = input.nextInt();
        input.close();

        System.out.println("Computer's Number: " + randomNumber);
        System.out.println("Player's Number: " + userNumber);

        if (userNumber == randomNumber) {
            System.out.println("You Win!");
        } else {
            System.out.println("You Lose :(");
        }
    }

}
