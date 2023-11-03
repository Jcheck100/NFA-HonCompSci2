import java.lang.*;
import java.util.*;

public class PrimeNumberP1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int userNumber, checkNumber;

        System.out.print("Please enter an integer greater than 1: ");
        userNumber = input.nextInt();

        checkNumber = userNumber % 2;
        if (userNumber == 2){
             System.out.println("The number " + userNumber + " is prime.");
             System.exit(0);
        }


        if (checkNumber != 0) {
            System.out.println("The number " + userNumber + " is prime.");
        } else {
            System.out.println("The number " + userNumber + " is not prime");
        }

    }

}
