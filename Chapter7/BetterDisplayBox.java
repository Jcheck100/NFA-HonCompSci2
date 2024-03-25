import java.util.*;

public class BetterDisplayBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width, length;
        String symbol;

        do {
            System.out.print("Please input the length of the box (Must be greater than 1): ");
            length = sc.nextInt();
        } while (length < 1);

        do {
            System.out.print("Please input the width of the box (Must be greater than 1): ");
            width = sc.nextInt();
        } while (width < 1);

        System.out.println("Would you like to print the box in a certain character? (y for yes n for no)");
        sc.nextLine();

        if ("y".equals(sc.nextLine())) {
            System.out.println("select a character: ");
            symbol = sc.nextLine();
            drawBox(width, length, symbol);
        } else {
            drawBox(width, length);
        }
        sc.close();

    }
//Prints a * and a space for whatever the width of the box is
    public static void drawBar(int w) {
        for (int i = 0; i < w; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
//calls drawBar(w) to print the correct amount of bars according to the length
    public static void drawBox(int w, int l) {
        for (int i = 0; i < l; i++) {
            drawBar(w);
        }
    }

//Prints whatever symbol the user chose and a space for whatever the width of the box is
    public static void drawBar(int w, String s) {
        for (int i = 0; i < w; i++) {
            System.out.print(s+ " ");
        }
        System.out.println();
    }
//calls drawBar(w,s) to print the correct amount of bars according to the length
    public static void drawBox(int w, int l, String s) {
        for (int i = 0; i < l; i++) {
            drawBar(w, s);
        }
    }

}
