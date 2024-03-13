import java.util.*;

public class CarRecalls {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int modelNumber;
        // boolean defective = false;

        System.out.print("Please input your cars model number: ");
        modelNumber = input.nextInt();

        switch (modelNumber) {
            case 119:
            case 179:
            case 189:
            case 190:
            case 191:
            case 192:
            case 193:
            case 194:
            case 195:
            case 196:
            case 221:
            case 780:
            System.out.println("\nYour car is defective!");
            break;
            default:
            System.out.println("\nYour car is not defective!");
            input.close();
        }
    }
}