import java.util.*;

public class NumberSum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int userNumber;
        int total = 0;

        System.out.println("please input a number: ");
        userNumber = input.nextInt();

        while (userNumber < 1) {
            System.out.println("Please dont enter a number less than 1 \n" +
                    "Please input a new number");
            userNumber = input.nextInt();
        }

        for (int num = 1; num <= userNumber; num++) {
            total += num;
            System.out.println(num);

        }
        System.out.println("the sum is:" + total);
        input.close();
    }
}
