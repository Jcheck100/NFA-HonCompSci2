import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userNum;

        System.out.println("Enter a number: ");
        userNum = input.nextInt();
        input.close();

        for (int i = 2; i <= userNum; i++) {
            while (userNum%i == 0) {
                System.out.println("The counter is: " + i);
                userNum = userNum/i;
            }
        }


    }
}