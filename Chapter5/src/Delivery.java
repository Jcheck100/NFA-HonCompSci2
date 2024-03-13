import java.util.*;

public class Delivery {
    public static void main(String[] args) {
        int width;
        int height;
        int length;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the width of the packege: ");
        width = input.nextInt();
        System.out.println("Please enter the height of the packege: ");
        height = input.nextInt();
        System.out.println("Please enter the length of the packege: ");
        length = input.nextInt();

        if (width >= 10 || length >= 10 || height >= 10 ) {
            System.out.println("Your packege was declined");
        } else {
            System.out.println("Your packege was accepted");
        }
        input.close();
    }
}
