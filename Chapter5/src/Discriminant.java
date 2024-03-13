
import java.util.Scanner;
public class Discriminant {
    public static void main(String[] args) {
        int bValue;
        int aValue;
        int cValue;
        double discriminant;
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter the a value:");
        aValue = input.nextInt();
        System.out.println("Please Enter the b value:");
        bValue = input.nextInt();
        System.out.println("Please Enter the c value:");
        cValue = input.nextInt();

        discriminant = (Math.pow((int) bValue, 2) - (4 * aValue * cValue));

        if (discriminant < 0){
            System.out.println("no roots");
        }else if (discriminant == 0) {
            System.out.println("One real root");
        }else if ( discriminant > 0){
            System.out.println("Two Real Roots");
        }
        input.close();
    }
}

        
