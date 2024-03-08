import java.util.*;

public class DisplayBox {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int length, width;
        String symbolChange = "", userSymbol = "*";

        do {
            System.out.print("Please input the length of the box (Must be greater than 1): ");
            length = input.nextInt();
        } while (length < 1);

        do {
            System.out.print("Please input the width of the box (Must be greater than 1): ");
            width = input.nextInt();
        } while (width < 1);

        drawBox(length, width);
    }

    public static void drawBar(int length, int width) {
        String symbol = "*";

        for (int i = 1; i <= width - 1 ; i++) {
            System.out.print(symbol);
            for (int j = 1; j <= length; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }

    }

    public static void drawBar(int length, int width, String userSymbol) {
        for (int i = 1; i <= width - 1; i++) {
            System.out.print(userSymbol);
            for (int j = 1; j <= length; j++) {
                System.out.print(userSymbol);
            }
            System.out.println();
        }

    }

    public static void drawBox(int length, int width) {

        String symbolChange = "", userSymbol = "*";

        System.out.println("Would you like the box to be made of a specific character? (y for yes, n for no)");
        symbolChange = input.next();
        if (symbolChange.equals("y")) {
            System.out.println("Please input the new character you would like to use");
            userSymbol = input.next();
            System.out.println();
            drawBar(length, width, userSymbol);
        } else {
            drawBar(length, width);
        }
    }

}
