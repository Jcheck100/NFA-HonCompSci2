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

    public static void drawBar(int w) {
        for (int i = 0; i < w; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    public static void drawBox(int w, int l) {
        for (int i = 0; i < l; i++) {
            drawBar(w);
        }
    }

    public static void drawBar(int w, String s) {
        for (int i = 0; i < w; i++) {
            System.out.print(s+ " ");
        }
        System.out.println();
    }

    public static void drawBox(int w, int l, String s) {
        for (int i = 0; i < l; i++) {
            drawBar(w, s);
        }
    }

}
