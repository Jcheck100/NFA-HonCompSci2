import java.util.*;

public class CarRecalls {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int modelNumber;
        boolean defective = false;

        System.out.print("Please input your cars model number: ");
        modelNumber = input.nextInt();

        switch (modelNumber) {
            case 119:
                defective = true;
            case 179:
                defective = true;
            case 221:
                defective = true;
            case 780:
                defective = true;
        }

        if (modelNumber >= 189 && modelNumber <= 196) {
            defective = true;
        }

        if (defective == true) {
            System.out.println("Your car has been recalled.");
        } else {
            System.out.println("No recalls for this vehicle.");
        }
    }
}
