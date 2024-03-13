import java.util.*;

public class CodingChallenge2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int userNumber = 0, finalNumber = 0;
        final int FLAG = -1;

        do {
            do {
                System.out.println("Please input your height above sea level, (-1 to quit)");
                userNumber = userInput.nextInt();
            } while (userNumber <= 1 && userNumber != FLAG);

            if (userNumber == FLAG) {
                break;
            }

            System.out.println("Please input your next height above sea level");
            finalNumber += Math.abs(userNumber - userInput.nextInt());

            System.out.println("The cumulative difference in sea levels is " + finalNumber);

        } while (true);
        userInput.close();
    }
}
