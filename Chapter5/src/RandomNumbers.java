import java.util.*;
public class RandomNumbers {

    public static void main(String[] args) {

        Random randomNumber = new Random();
        int min;
        int max;
        int randomNumber2;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the minimum number: ");
        min = input.nextInt();
        System.out.print("Enter the maximum number: ");
        max = input.nextInt();
        input.close();

        randomNumber2 = randomNumber.nextInt (max - min + 1) + min;
        System.out.println("the random number is: " + randomNumber2);
    }
}
