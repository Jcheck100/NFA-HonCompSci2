import java.util.Scanner;

public class PrimeNumbersPartB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Min;
        int Max;
        boolean prime = true;
        String usedPrimes = "";

        do {
            System.out.print("Enter a minimum: ");
            Min = input.nextInt();
        } while (Min < 0);

        do {
            System.out.print("Enter a maximum: ");
            Max = input.nextInt();
        } while (Max < Min);
        input.close();

        if (Min < 2) {
            Min = 2;
        }

        for (int j = Min; j <= Max; j++) {
            prime = true;
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    prime = false;
                }
            }
            if (prime) {
                System.out.println(j);
                usedPrimes += j;
            }
        }

        if (usedPrimes.equals("")) {
            System.out.println("There's no prime numbers between " + Min + " and " + Max);
        }

    }
}