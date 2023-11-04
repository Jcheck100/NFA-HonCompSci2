import java.util.Random;
import java.util.Scanner;

public class Wordle {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        String wordList[] = { "BRAIN", "LOSER", "JUNKS", "FUZED", "JOCKS", "COBRA", "QUAKE", "JUICY", "JOKED", "ZESTY",
                "ADIEU", "STARE", };
        String secretWord = wordList[rand.nextInt(wordList.length)];
        String userInput;
        Scanner input = new Scanner(System.in);
        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";
        int maxGuess = 5, guessCounter = 0;
        boolean correct = false;

        System.out.println(
                "\nYou will have 5 attempts to guess a random five-letter word.\nLetters in the correct spot will be "
                        + GREEN + "green, " + RESET + "letters in the incorrect spot will be " + YELLOW
                        + "yellow, " + RESET + "and letters not in the word will be " + RED + "red " + RESET);

        System.out.println("Enter a word!");

        do {
            userInput = input.nextLine().toUpperCase(); // Convert input to uppercase to match secretWord's case

            if (userInput.length() > 5) {
                System.out.println("Invalid Guess, word is too long");
            } else if (userInput.length() < 5) {
                System.out.println("Invalid Guess, word is too short");
            } else {
                for (int i = 0; i < 5; i++) {
                    String userChar = userInput.substring(i, i + 1);
                    String secretChar = secretWord.substring(i, i + 1);

                    if (userChar.equals(secretChar)) {
                        System.out.print(GREEN + userChar + RESET);
                    } else if (secretWord.contains(userChar)) {
                        System.out.print(YELLOW + userChar + RESET);
                    } else {
                        System.out.print(RED + userChar + RESET);
                    }
                }

                System.out.println();

                if (userInput.equals(secretWord)) {
                    correct = true;
                }

                guessCounter++;
            }
        } while (guessCounter < maxGuess && !correct);

        if (correct) {
            System.out.println("Congratulations! You guessed the word: " + secretWord);
        } else {
            System.out.println("Sorry, you're out of guesses. The word was: " + secretWord);
        }
    }
}
