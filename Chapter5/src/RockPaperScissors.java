import java.util.*;

public class RockPaperScissors {
    public static void main(String[] args) {

        Random computerNumber = new Random();
        final int Rock = 1, Paper = 2, Scissors = 3;
        int userNumber;
        int computerNumber2;
        Scanner input = new Scanner(System.in);
        computerNumber2 = computerNumber.nextInt(3) + 1;

        System.out.print ("Please input your throw (1 = Rock, 2 = Paper 3= Scissors): ");
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
        if (userNumber == Paper && computerNumber2 == Rock || userNumber == Scissors && computerNumber2 == Paper
                || userNumber == Rock && computerNumber2 == Scissors) {
            System.out.println("You Win");
        }

        if (userNumber == Rock && computerNumber2 == Paper || userNumber == Paper && computerNumber2 == Scissors
                || userNumber == Scissors && computerNumber2 == Rock) {
            System.out.println("CPU Wins");
        }

        if (userNumber == computerNumber2) {
            System.out.println("it's a tie");
        }

    }

}
