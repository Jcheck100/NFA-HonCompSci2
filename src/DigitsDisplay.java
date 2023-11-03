import java.util.*;
import java.lang.String;

public class DigitsDisplay {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userNumber, tempNumber;

        System.out.println("Please enter a positive integer: ");
        userNumber = input.nextInt();
        do {
        tempNumber = (userNumber % 10);
          System.out.println(tempNumber);
          userNumber = (userNumber/10);
        } while (userNumber != 0);
    

   
}
}
