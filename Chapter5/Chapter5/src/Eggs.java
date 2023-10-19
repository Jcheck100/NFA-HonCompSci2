import java.text.NumberFormat;
import java.util.*;

public class Eggs {
    public static void main(String[] args) {
        double numEggs;
        double eggBill;
        double eggDozen;
        int extraEggs;
        Scanner input = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.print("Please input the number of eggs you wish to purchase: ");
        numEggs = input.nextInt();
        input.close();

        eggDozen = (numEggs / 12);
        extraEggs = (int)numEggs % 12;

        if (eggDozen <= 3) {
            eggBill = eggDozen * .50;
        } else {
            if ((eggDozen >= 4) && (eggDozen < 5)) {
                eggBill = eggDozen * .45;
            } else {
                if ((eggDozen >= 6) && (eggDozen < 11)) {
                    eggBill = eggDozen * .40;
                } else {
                    if (eggDozen >= 11) {
                        eggBill = eggDozen * .3;
                    } else {
                        eggBill = 0;

                    }
                }
            }
        }
        if (extraEggs > 0) {
            if (eggDozen <= 3) {
                eggBill += extraEggs * .50;
            } else if (eggDozen >= 4 && eggDozen < 5) {
                eggBill += extraEggs * .45;
            } else if (eggDozen >= 6 && eggDozen < 11) {
                eggBill += extraEggs * .40;
            } else {
                eggBill += extraEggs * .30;
            }
        }

        System.out.println("The total cost of " + numEggs + " eggs is " + money.format(eggBill));
    }
}
