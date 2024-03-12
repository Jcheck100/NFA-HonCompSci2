import java.util.*;

public class HiLow {
    public static void main(String[] args) {
        int points = 1000, wager, guess, randomNumber;
        String userChoice;
        Scanner sc = new Scanner(System.in);
        System.out.println("High Low Guessing Game");
        System.out.println(
                "\nRules\nNumbers 1 through 6 are Low\nNumbers 8 through 13 are High\n7 is niether high or low");
        do {
            System.out.println("\nYou have " + points + " points");

            randomNumber = generateRandomNumber();
  
            System.out.println("How many points would you like to wager?");
            wager = sc.nextInt();

            do {
                System.out.println("Predict (High 1, Low 0): ");
                guess = sc.nextInt();
            } while (guess != 1 && guess != 0);

            points = isCorrect(guess, randomNumber, points, wager);

            System.out.println(
                    "\nWould you like to play again? " + "you have: " + points + " points " + "(y for yes, n for no)");
            userChoice = sc.next().toLowerCase();

        } while (!userChoice.equals("n") && points > 0);
        sc.close();
    }

    public static int generateRandomNumber() {
        int randomNumber, max = 13, min = 1;
        Random r = new Random();
        randomNumber = r.nextInt(max - min + 1) + min;

        return (randomNumber);
    }

    public static int isCorrect(int guess, int randomNumber, int points, int wager) {
        switch (guess) {
            case 0:
                if (randomNumber <= 6 && randomNumber > 0) {
                    points += wager * 2;
                    System.out.println("You win!\nThe random number was: " + randomNumber);
                    break;
                } else if (randomNumber >= 7 && randomNumber < 14) {
                    points -= wager;
                    System.out.println("You lose!\nThe random number was: " + randomNumber);
                    break;
                }

            case 1:
                if (randomNumber > 7 && randomNumber < 14) {
                    points += wager * 2;
                    System.out.println("You Win!\nThe random number was: " + randomNumber);
                    break;
                } else if (randomNumber <= 7 && randomNumber > 0) {
                    points -= wager;
                    System.out.println("You Lose!\nThe random number was: " + randomNumber);
                    break;
                }
        }

        return points;

    }
}
