import java.util.Scanner;

public class Exponentiation {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter base number: ");
        int baseNumber = input.nextInt();
        System.out.println("Enter exponent: ");
        int exponent = input.nextInt();

        System.out.println(powerOf(baseNumber, exponent));

    }

    public static int powerOf(int baseNumber, int exponent) {
        int finalNumber = baseNumber;
        for (int i = 0; i < exponent - 1; i++) {
            finalNumber *= baseNumber;
        }

        return (finalNumber);

    }
}
