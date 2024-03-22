import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int min;
        int max;
        boolean prime;

        do {
            System.out.print("Enter a minimum: ");
            min = input.nextInt();
        } while (min < 0);

        do {
            System.out.print("Enter a maximum: ");
            max = input.nextInt();
        } while (max < min);
        input.close();

        if (min < 2) {
            min = 2;
        }

        for (int j = min; j <= max; j++) {
            prime = isPrime(j);

            if (prime) {
                System.out.println(j);
            }
        }

    }
    
/*Checks for prime numbers by checking if the number is evenly divisible by 2
if it is the method returns true, otherwise the method returns false
*/
    public static boolean isPrime(int currentNum) {
        boolean prime = true;
        for (int i = 2; i <= currentNum / 2; i++) {
            if (currentNum % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            return (true);
        } else {
            return (false);
        }
    }

}