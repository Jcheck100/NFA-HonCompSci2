import java.lang.Math;

public class PythagreonTriples {
    public static void main(String[] args) {
        double c;
        for (int a = 1; a <= 100; a++) {
            for (int b = 1; b <= 100; b++) {
                if ((a<b) && isPerfectSquare(Math.pow(a, 2) + Math.pow(b, 2))) {
                    c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
                    System.out.println(a + " " + b + " " + (int) c);
                }
            }
        }
    }

    public static boolean isPerfectSquare(double number) {
        double num = number;

        number = Math.sqrt(number);

        number = (double) number;

        number = Math.pow((int) number, 2);

        if (number == num) {
            return (true);
        } else {
            return (false);
        }
    }

}
