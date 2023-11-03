import java.text.NumberFormat;
import java.util.*;

public class PercentPassing {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int gradeInput;
        int counter1 = 0;
        int counter2 = 0;
        NumberFormat percentFormat = NumberFormat.getPercentInstance();

        do {
            System.out.print("please input a grade (-1 to end): ");
            gradeInput = input.nextInt();
            if (gradeInput >= 70) {
                counter1++;
            } else {
                counter2++;
            }
        } while (gradeInput != -1);

        double counterTotal = counter1 + counter2;
        double percent70 = counter1 / counterTotal;

        System.out.println("The percent of students with a grade above 70 is: " + percentFormat.format(percent70));
    }
}
