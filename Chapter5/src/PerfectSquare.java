import java.util.*;

public class PerfectSquare {

    public static void main(String[] args) {
        double userInput;
        double userInput2;
        double userInput3;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        userInput = input.nextDouble();

        userInput2 = Math.sqrt(userInput);

        userInput3 = Math.pow((int) userInput2, 2);

        if (userInput == userInput3) {
            System.out.println((int)userInput + " is a perfect square.");
        } else {
            System.out.println((int)userInput + " is not a perfect square.");
        }
        input.close();
    }
}