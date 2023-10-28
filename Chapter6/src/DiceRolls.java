
import java.util.Random;

public class DiceRolls {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;
            int dieTotal = die1 + die2;
            System.out.println("Roll " + (i + 1) + ": " + die1 + ", " + die2 + " Total: " + dieTotal);
        }
    }
}
