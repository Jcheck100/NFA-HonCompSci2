import java.util.*;
import java.util.Random;
import java.lang.String;

public class Wordle {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        String wordList[] = { "APPLE", "BRAIN", "LOSER" };
        String secretWord = wordList[rand.nextInt(wordList.length)];
        int guessesTaken = 0, guessLimit = 6;

        String userInputs[] = new String[5]; // gets user inputs
        for (int i = 0; i < 5; i++) {
            userInputs[i] = input.next().StringAt(0);
        }

        String guess = String.valueOf(userInputs);
        System.out.println(guess);

        if (guess == secretWord) {
            System.out.println("Congratulations! You've won!");
        } else {
            System.out.println("Sorry, you didn't win this time.");
        }
        }
    }

