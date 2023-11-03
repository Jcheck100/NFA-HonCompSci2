import java.util.*;
public class Factorial {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int userNumber;
        int times;
        int factorial=1;

        System.out.println("please input a number: ");
        userNumber = input.nextInt();
        for ( times = 1; times <= userNumber; times++){
                factorial = factorial * times;    
        }
        System.out.println("Factorial of " + userNumber +" is: " + factorial);

    }
}
