import java.util.Scanner;

public class Exponentiation {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter base number: ");
        int baseNumber = input.nextInt();
        System.out.println("Enter exponent: ");
        int exponent = input.nextInt();
        int finalNumber = baseNumber;

        powerOf(baseNumber, exponent, finalNumber);

    }
    public static void powerOf(int baseNumber, int exponent, int finalNumber){
        for (int i = 0 ; i < exponent - 1 ; i++){
            finalNumber *= baseNumber;
        }
    
        System.out.println(finalNumber);

    }
}
