import java.text.NumberFormat;
import java.util.*;

public class AddCoins {
   public static void main(String[] args) {
      NumberFormat money = NumberFormat.getCurrencyInstance();
      Scanner input = new Scanner(System.in);
      double pennies, nickels, dimes, quarters;

      System.out.println("Please enter the number of pennies:");
      pennies = input.nextDouble();
      System.out.println("Please enter the number of nickles:");
      nickels = input.nextDouble();
      System.out.println("Please enter the number of dimes:");
      dimes = input.nextDouble();
      System.out.println("Please enter the number of quarters:");
      quarters = input.nextDouble();
      input.close();

      System.out.println(money.format(getDollarAmount(pennies, nickels, dimes, quarters)));

   }

   public static double getDollarAmount(double pennies, double nickels, double dimes, double quarters) {

      pennies /= 100;
      nickels *= .05;
      dimes /= 10;
      quarters *= .25;

      double total = pennies + nickels + dimes + quarters;

      return (total);

   }
}
