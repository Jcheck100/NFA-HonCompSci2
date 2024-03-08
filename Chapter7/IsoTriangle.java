import java.util.*;

public class IsoTriangle {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int lines = userInput.nextInt();

        drawBar(lines);
        userInput.close();
    }

    public static void drawBar(int lines) {
        int units = 1;
        String unit = "*";
        for (int i = 1; i <= lines; i++) {
            System.out.print("*");
            addSpaces(lines, i);
            for (int j = 1; j <= units; j++) {
                System.out.print(unit);
            }
            units += 2;
            System.out.println();
        }
    }

    public static void addSpaces(int lines, int i) {
        int spaces;
        String unit = " ";
        lines = (lines + 2) / 2;
        spaces = (int) lines;
        int counter = 1;
        spaces += lines - 1;

        for (int j = i - 1; j <= spaces; j++) {
            if (j >= 5) {
                spaces -= counter;
                for (int k = j; k <= spaces; k++) {
                    System.out.print(unit);
                    counter += 2;
                }
            } else {
                System.out.print(unit);

            }

        }
    }
}