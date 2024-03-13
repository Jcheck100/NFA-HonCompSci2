import java.text.NumberFormat;
import java.util.*;

public class CarPayment {
    public static void main(String[] args) {
        double pValue; // Pricipal
        double rValue; // intrest rate
        double mValue; // number of monthly payments
        Scanner input = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();


        System.out.print("please input the principal:");
        pValue = input.nextDouble();
        System.out.print("please input the intrest rate (decimal format): ");
        rValue = input.nextDouble();
        System.out.print("please input the noumber of monthly payments: ");
        mValue = input.nextDouble();

        double numerator = (pValue * (rValue/12));
        double denominator = (1 - Math.pow(1+(rValue/12), -mValue));
        double total = numerator/denominator;

        System.out.println("The monthly payment is: " + money.format(total));
        input.close();
    }
}
