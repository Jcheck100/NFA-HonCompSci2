import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int userNumber;
        int times;
        int oddNumberSum = 0;
        System.out.print("please input a number");
        userNumber = input.nextInt();

        for (times = 1; times <= userNumber; times++) {
            if (times % 2 == 1) {
                oddNumberSum = oddNumberSum + times;
            }
        }
        System.out.println(oddNumberSum);
    }
}
