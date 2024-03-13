import java.util.*;

public class RockPaperScissorsP2 {
    public static void main(String[] args) {

        /* Rock beats lizard and Scissors
         * Lizard beats paper and spock
         * spock beats scissors and paper
         * scissors beats paper and lizard
         * paper beats rock and spock
         */

        Random computerNumber = new Random();
        final int Rock = 1, Paper = 2, Scissors = 3;
        int userNumber;
        int computerNumber2;
        Scanner input = new Scanner(System.in);
        computerNumber2 = computerNumber.nextInt(3) + 1;

        System.out.print("Please input your throw (1 = Rock, 2 = Paper 3= Scissors): ");
        userNumber = input.nextInt();
        input.close();

        switch (userNumber) {
            case Rock:
                System.out.println("You throw Rock!");
                break;
            case Scissors:
                System.out.println("You throw Scissors!");
                break;
            case Paper:
                System.out.println("You throw Paper!");
                break;
        }
        switch (computerNumber2) {
            case Rock:
                System.out.println("CPU throw Rock!");
                break;
            case Scissors:
                System.out.println("CPU throw Scissors!");
                break;
            case Paper:
                System.out.println("CPU throw Paper!");
                break;

        }
        switch (userNumber) {
            case 1:
                if (userNumber == Rock && computerNumber2 == Scissors) {
                    System.out.println("You Win");
                } else if (userNumber == Rock && computerNumber2 == Paper) {
                    System.out.println("CPU Win");
                } else if (userNumber == Rock && computerNumber2 == Rock) {
                    System.out.println("Its a Tie");
                }
                break;
            case 2:
               if (userNumber == Paper && computerNumber2 == Scissors) {
                    System.out.println("You Lose");
                } else if (userNumber == Paper && computerNumber2 == Paper) {
                    System.out.println("Its a Tie");
                } else if (userNumber == Paper && computerNumber2 == Rock) {
                    System.out.println("You Win");
                }
                break;
            case 3:
                if (userNumber == Scissors && computerNumber2 == Scissors) {
                    System.out.println("Its a Tie");
                } else if (userNumber == Scissors && computerNumber2 == Paper) {
                    System.out.println("You Win");
                } else if (userNumber == Scissors && computerNumber2 == Rock) {
                    System.out.println("You Lose");
                }
                break;
               

    }
    input.close();
    }
}
