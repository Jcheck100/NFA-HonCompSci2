import java.text.NumberFormat;
import java.util.*;

public class PercentPassing {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        final int FLAG = -1;
        int gradeInput = 0;
        int above70 = 0;
        int totalScores = 0;
        double percent;
        NumberFormat percentFormat = NumberFormat.getPercentInstance();

        while (gradeInput != FLAG) {
            System.out.print("please input a grade (-1 to end): ");
            gradeInput = input.nextInt();
            if (gradeInput >= 70) {
                above70++;
                totalScores++;
            } else {
                totalScores++;
            }
        }
        input.close();
        percent = (double)above70/((double)totalScores - 1);

        System.out.println("The percent of students with a grade above 70 is: " + percentFormat.format(percent));
    }

}