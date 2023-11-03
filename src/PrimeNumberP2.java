import java.util.Scanner;

public class PrimeNumberP2 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int userNumberOne, userNumberTwo, checkNumber;

        System.out.print("Please enter an integer greater than 1: ");
        userNumberOne = input.nextInt();

        System.out.print("Please enter an integer greater than the last: ");
        userNumberTwo = input.nextInt();

        for (int i; userNumberOne <= userNumberTwo; userNumberOne++) {
            checkNumber = userNumberOne % 2;
            if (userNumberOne == 2) {
                System.out.println("The number " + userNumberOne + " is prime.");
            } else {
                if (checkNumber != 0) {
                    System.out.println("The number " + userNumberOne + " is prime.");
                }
            }

        }
    }
}
