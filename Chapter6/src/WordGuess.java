import java.util.*;
import java.lang.String;

public class WordGuess {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int score = 100;
        final String word = "BRAIN";
        final String FLAG = "!";
        String wordSoFar = "", updatedWord = "";
        String letterGuess, wordGuess = "";
        int numGuesses = 0;

        /* begin game */
        System.out.println("WordGuess game.\n");
        for (int i = 0; i < word.length(); i++) {
            wordSoFar += "-"; // word as dashes
        }
        System.out.println(wordSoFar + "\n"); // display dashes
        /* allow player to make guesses */
        do {
            do{
            System.out.print("Enter a letter (" + FLAG + " to guess entire word): ");
            letterGuess = input.nextLine();
            letterGuess = letterGuess.toUpperCase();
            }while(letterGuess.length() != 1);
            

            /* increment number of guesses */
            numGuesses += 1;
            score -= 10;
            if (score == 0) {
            System.out.println("You lose, your score was: " + score);
            System.out.println("the application will now close");
            System.exit(0);

            }
            /*
             * player correctly guessed a letter--extract string in wordSoFar * up to the
             * letter guessed and then append guessed letter to that * string Next, extract
             * rest of wordSoFar and append after the guessed * letter
             */
            if (word.indexOf(letterGuess) >= 0) {
                updatedWord = wordSoFar.substring(0, word.indexOf(letterGuess));
                updatedWord += letterGuess;
                updatedWord += wordSoFar.substring(word.indexOf(letterGuess) + 1, wordSoFar.length());
                wordSoFar = updatedWord;
            }

            /* display guessed letter instead of dash */
            System.out.println(wordSoFar + "\n");
        } while (!letterGuess.equals(FLAG) && !wordSoFar.equals(word));
        /* finish game and display message and number of guesses */

        
        if (letterGuess.equals(FLAG)) {
            System.out.println("What is your guess? ");
            wordGuess = input.nextLine();
            wordGuess = wordGuess.toUpperCase();
        }
        if (wordGuess.equals(word) || wordSoFar.equals(word)) {
            System.out.println("You won!");
        } else {
            System.out.println("Sorry. You lose.");
        }
        System.out.println("The secret word is " + word);
        System.out.println("You made " + numGuesses + " guesses.");
         System.out.println("Your score was: " + score);
         input.close();
    }
}