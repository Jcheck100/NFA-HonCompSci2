import java.util.*;

public class Nim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalStones = generateNumberOfStones(), userStones, computerStones;
        boolean playerWin = false;

        do {
            do {
                System.out.println("\nThere are " + totalStones + " stones, how many would you like to take?");
                userStones = sc.nextInt();
            } while (!isValid(userStones, totalStones));
            if (userStones == 1) {
                System.out.println("You take " + userStones + " stone");
            } else {
                System.out.println("You take " + userStones + " stones");
            }

            if (totalStones - userStones == 0) {
                System.out.println("You Lose");
                playerWin = false;
                break;
            } else {
                totalStones -= userStones;
                computerStones = drawStones(totalStones);
                if (computerStones == 1) {
                    System.out.println("The computer takes " + computerStones + " stone");
                } else {
                    System.out.println("The computer takes " + computerStones + " stones");
                }
                if (totalStones - computerStones == 0) {
                    System.out.println("You Win!");
                    break;
                }
                totalStones -= computerStones;
                playerWin = true;
            }

        } while ((totalStones > 0 && playerWin) || (totalStones > 0 && !playerWin));
        sc.close();
    }

    public static boolean isValid(int userStones, int totalStones) {
        if ((userStones == 1 || userStones == 2 || userStones == 3) && (userStones <= totalStones)) {
            return (true);
        } else {
            return (false);
        }
    }

    public static int generateNumberOfStones() {
        int randomNumber, max = 30, min = 15;
        Random r = new Random();
        randomNumber = r.nextInt(max - min + 1) + min;

        return (randomNumber);
    }

    public static int drawStones(int totalStones) {
        Random r = new Random();
        int randomNumber, max = 3, min = 1;
        if (totalStones == 1) {
            max = 1;
        } else if (totalStones == 2) {
            max = 2;
        } else {
            max = 3;
        }
        randomNumber = r.nextInt(max - min + 1) + min;
        return (randomNumber);
    }
}