import java.util.*;

public class CarRecallsP2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int modelNumber = -1;
        boolean defective = false;

        do {
            defective = false;
            System.out.print("Please input your cars model number: ");
            modelNumber = input.nextInt();

            if (modelNumber >= 189 && modelNumber <= 196 || modelNumber == 119 || modelNumber == 179
                    || modelNumber == 221 || modelNumber == 780) {
                defective = true;
            }

            if (defective == true && modelNumber != -1) {
                System.out.println("Your car has been recalled.");
            } else if (modelNumber != -1) {
                System.out.println("No recalls for this vehicle.");
            }
        } while (modelNumber != -1);

        input.close();
    }
}
