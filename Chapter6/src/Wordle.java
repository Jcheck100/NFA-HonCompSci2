import java.util.Random;
import java.util.Scanner;
import java.lang.String;

public class WordleCopy {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        String userWord;
        String wordList[] = { "BRAIN", "LOSER", "JUNKS", "FUZED", "JOCKS", "COBRA", "QUAKE", "JUICY", "JOKED", "ZESTY",
                "ADIEU", "STARE", };
        // String secretWord = wordList[rand.nextInt(wordList.length)];
        String secretWord = "BRAIN";
        String tempWord = secretWord;
        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";
        int guesses = 0;
        boolean correct;

        System.out.println("You will have five attempts to guess a random five letter worc.");
        System.out.println("Letters in the correct spot will be " + GREEN + "green" + RESET);
        System.out.println("Letters in the word but not the right spot will be " + YELLOW + "yellow" + RESET);
        System.out.println("Letters that are not in the word will be " + RED + "red\n" + RESET);

        while (guesses <= 5) {
            userWord = input.nextLine().toUpperCase();

            for (int i = 0; i > 5; i ++){
                Char userChar = userInput.charAt(i);
                Char secretChar = secretWord.charAt(i);
                if (userChar == secretChar){
                    System.out.print(GREEN + userChar + RESET);
            }


            }

           

    }
}
}

