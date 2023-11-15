import java.util.Random;
import java.util.Scanner;
import java.lang.String;
import java.util.ArrayList;

public class WordleCopy {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        String userWord;
        String wordList[] = { "BRAIN", "LOSER", "JUNKS", "FUZED", "JOCKS", "COBRA", "QUAKE", "JUICY", "JOKED", "ZESTY",
                "ADIEU", "STARE", };
        String secretWord = "BRAIN";
        String tempWord = secretWord;
        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";
        String correct = secretWord;

        System.out.println("You will have five attempts to guess a random five letter worc.");
        System.out.println("Letters in the correct spot will be " + GREEN + "green" + RESET);
        System.out.println("Letters in the word but not the right spot will be " + YELLOW + "yellow" + RESET);
        System.out.println("Letters that are not in the word will be " + RED + "red\n" + RESET);

        for (int round = 0; round < 6; round++) {
            System.out.print("Enter a guess: ");
            userWord = input.nextLine().toUpperCase();
            tempWord = userWord;

            // Create a loop to iterate through each
            ArrayList<String> usedChars = new ArrayList<String>();
            for (int i = 0; i < 5; i++) {
                if (tempWord.equals(correct)) {
                    System.out.println("You Win!");
                    break;
                } else if (userWord.substring(i, i + 1).equals(correct.substring(i, i + 1))) {
                    // Letter matches
                    System.out.print(GREEN + userWord.substring(i, i + 1) + RESET);
                    usedChars.add(userWord.substring(i, i + 1));
                }else if (usedChars.contains(userWord.substring(i, i + 1))){
                    System.out.print(RED + userWord.substring(i, i + 1)+ RESET);
                }else{
                    System.out.print(YELLOW + userWord.substring(i, i + 1) + RESET);
                }

                }

            }

    }
}

    
