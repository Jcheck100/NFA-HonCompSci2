import java.util.Scanner;

public class BetterIsoTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = 0;
        do {
            System.out.println("How many lines would you like the triangle to be?");
            length = sc.nextInt();
        } while (length <= 0);
        sc.close();

        drawBar(length);

    }

    /*
     * Takes the length from the user and references it in the for loop, the for
     * loop then calls drawSpaces. Once this is done the nested for loop prints a *
     * until j=units, the units += 2 at the end allows for the triangle to be
     * printed as an isometric triangle would always increase in size by 2 stars
     */
    public static void drawBar(int length) {
        int units = 1;
        for (int i = 1; i <= length; i++) {
            drawSpaces(length, i);
            for (int j = 1; j <= units; j++) {
                System.out.print("*");
            }
            units += 2;
            System.out.println();
        }
    }

    /* adds a space in front of the * until j=length */
    public static void drawSpaces(int length, int i) {
        for (int j = i; j < length; j++)
            System.out.print(" ");

    }
}
