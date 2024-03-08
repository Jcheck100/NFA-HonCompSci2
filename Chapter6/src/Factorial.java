import java.util.*;

public class Factorial {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int userNumber;
        int factorial = 1;

        System.out.println("please input a number:");
        userNumber = input.nextInt();

        while(userNumber < 1) {
            System.out.println("Please dont enter a number less than 1 \n" +
                    "Please input a new number");
            userNumber = input.nextInt();
        }
        for (int i = 1; i <= userNumber; i++) {
            factorial *= i;
        }
        
        System.out.println("The factorial of " + userNumber + " is: " + factorial);
        input.close();
    }
}
