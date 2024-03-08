import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userNum;
        boolean prime = true;

        do {
            System.out.print("Enter a number: ");
            userNum = input.nextInt();
        } while (userNum < 0);
        input.close();

        for (int i = 2; i <= userNum / 2; i++) {
            if (userNum % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime) {
            System.out.println("Your number is prime");
        } else {
            System.out.println("Your number is not prime");
        }

    }
}