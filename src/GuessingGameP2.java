import java.util.*;

public class GuessingGameP2 {
    public static void main(String[] args) {
        int userNumber = 0;
        int randomNumber;
        final int max = 20;
        final int min = 1;
        Random tempRandomNumber = new Random();

        randomNumber = tempRandomNumber.nextInt(max - min + 1) + min;

        for (; userNumber != randomNumber;) {
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter a number between 1 and 20: ");
            userNumber = input.nextInt();

            if (userNumber > randomNumber) {
                System.out.println("Try again (lower)");
            } else {
                if (userNumber<randomNumber){
                System.out.println("Try Again (higher)");
                }else{
                    if (userNumber==randomNumber);
                        System.out.println("You Win!");
                }

            }
        }
    }

}