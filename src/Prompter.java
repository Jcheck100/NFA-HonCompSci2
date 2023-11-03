import java.util.*;
public class Prompter {
    public static void main(String[] args) throws Exception {
        int min;
        int max;
        int userNumber;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the min: ");
        min = input.nextInt();

        System.out.print("Please enter the max: ");
        max = input.nextInt();

        do {
            System.out.print("Please enter a number in the range you provided: ");
        userNumber = input.nextInt();
        } while (userNumber < min || userNumber > max);

        System.out.println("Thank you for entering a number in the range you provided, the program will now close");
        }
    }

