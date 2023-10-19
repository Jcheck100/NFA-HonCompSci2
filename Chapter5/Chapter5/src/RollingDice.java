import java.text.NumberFormat;
import java.util.*;

public class RollingDice {
    public static void main(String[] args) {
        NumberFormat percent = NumberFormat.getPercentInstance();
        int dieRoll1;
        int dieRoll2;
        Random tempRandomNumber1 = new Random();
        Random tempRandomNumber2 = new Random();
        final int max = 6;
        final int min = 1;
        double probabilty;

        dieRoll1 = tempRandomNumber1.nextInt(max - min + 1) + min;
        dieRoll2 = tempRandomNumber2.nextInt(max - min + 1) + min;

        int dieTotal = (dieRoll1 + dieRoll2);
        probabilty = (double) dieTotal / (double) 36;

        System.out.println("You rolled a " + dieRoll1 + " and a " + dieRoll2);
        System.out.println("Total of both die: " + dieTotal);
        System.out.println("The chance of rolling a " + dieTotal + " is " + percent.format(probabilty));

    }
}