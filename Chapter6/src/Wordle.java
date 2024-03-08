import java.util.Random;
import java.util.Scanner;

public class Wordle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        // Chooses secret word
        String wordList[] = { "BRAIN", "LOSER", "JUNKS", "FUZED", "JOCKS", "COBRA", "QUAKE", "JUICY", "JOKED", "ZESTY",
                "ADIEU", "STARE", };

        String secretWord = wordList[rand.nextInt(wordList.length)];
        String userWord;
        String tempUserWord = "";
        String tempSecretWord = secretWord;
        String correct = secretWord;
        String usedChars = "";
        char userChar;
        char secretChar;

        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";

        boolean win = false;
        int guesses = 1;

        System.out.println("You will have five attempts to guess a random five letter word.");
        System.out.println("Letters in the correct spot will be " + GREEN + "green" + RESET);
        System.out.println("Letters in the word but not the right spot will be " + YELLOW + "yellow" + RESET);
        System.out.println("Letters that are not in the word will be " + RED + "red\n" + RESET);

        // loops guesses 5 times
        do {

            // Makes user enter five letter word
            do {

                System.out.println("Enter a five letter word: ");
                userWord = input.next().toUpperCase();
                tempUserWord = "";
            } while (userWord.length() != 5);

            // Checks if guess is correct
            if (userWord.equals(correct)) {
                win = true;
                break;
            }

            tempSecretWord = secretWord;

            // iterates through users word
            for (int userIndex = 0; userIndex < secretWord.length(); userIndex++) {

                userChar = userWord.charAt(userIndex);
                usedChars = "";

                // Letter in word and right place
                for (int secretIndex = 0; secretIndex < secretWord.length(); secretIndex++) {

                    secretChar = tempSecretWord.charAt(secretIndex);

                    if (userChar == secretChar && userIndex == secretIndex) {
                        tempUserWord += GREEN + userChar + RESET;
                        tempSecretWord = tempSecretWord.replace(userChar, '`');
                        usedChars += userChar;
                    }
                }

                // Letter in word and in wrong place
                for (int secretIndex = 0; secretIndex < secretWord.length(); secretIndex++) {
                    secretChar = tempSecretWord.charAt(secretIndex);

                    if (tempSecretWord.contains(String.valueOf(userChar)) && secretIndex != userIndex) {
                        tempUserWord += YELLOW + userChar + RESET;
                        tempSecretWord = tempSecretWord.replace(userChar, '-');
                        usedChars += userChar;
                        break;
                    }

                }

                // Letter not in word
                for (int secretIndex = 0; secretIndex < secretWord.length(); secretIndex++) {
                    secretChar = tempSecretWord.charAt(secretIndex);

                    if (tempSecretWord.charAt(userIndex) != '-' || tempSecretWord.charAt(userIndex) != '`') {
                        if (!tempSecretWord.contains(String.valueOf(userChar))) {
                            if (!usedChars.contains(String.valueOf(userChar))) {
                                tempUserWord += RED + userChar + RESET;
                                break;
                            }

                        }

                    }
                }
            }

            // System.out.println(tempSecretWord);
            System.out.println(tempUserWord);
            guesses += 1;

        } while (guesses <= 5);
        input.close();

        if (win) {
            System.out.println("You Win!");
        } else {
            System.out.println("Guess better :(");
        }
        input.close();
    }
}