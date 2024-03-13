import java.util.*;

public class CodingChallenge3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sumNumbers = "";
        String nums = "";
        int total = 0;
        char current = ' ';

        System.out.println("enter a string");
        sumNumbers = sc.nextLine();

        for (int i = 0; i <= sumNumbers.length() - 1; i++) {

            current = sumNumbers.charAt(i);
            if (Character.isDigit(current)) {
                nums += current;
            } else if (!nums.equals("")) {
                total += Integer.parseInt(nums);
                nums = "";
            }

        }
        if (!nums.equals("")) {
            total += Integer.parseInt(nums);
        }
        System.out.println("The total is: " + total);
        sc.close();
    }

}
