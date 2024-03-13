import java.util.Scanner;

public class OddSum {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        int userNumber;
        int times;
        int oddNumberSum = 0;
        System.out.print("please input a number: ");
        userNumber = input.nextInt();

        while (userNumber < 1) {
            System.out.println("Please dont enter a number less than 1 \n" +
                    "Please input a new number");
            userNumber = input.nextInt();
        }

        for (times = 1; times <= userNumber; times++) {
            if (times % 2 == 1) {
                oddNumberSum = oddNumberSum + times;
            }
        }
        System.out.println(oddNumberSum);
        input.close();
  
    }
}