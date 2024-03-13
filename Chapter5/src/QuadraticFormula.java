import java.util.*;

public class QuadraticFormula {
    public static void main(String[] args) {
        int bValue;
        int aValue;
        int cValue;
        double discriminant;
        double root1;
        double root2;
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter the a value:");
        aValue = input.nextInt();
        System.out.println("Please Enter the b value:");
        bValue = input.nextInt();
        System.out.println("Please Enter the c value:");
        cValue = input.nextInt();

        discriminant = (Math.pow((int) bValue, 2) - (4 * aValue * cValue));

        if (discriminant < 0) {
            System.out.println("Discriminant cannot be negative the application will now close");
            System.exit(0);
        } else {
            if (discriminant == 0) {
                root1 = (-bValue + Math.sqrt(discriminant)) / (2 * aValue);
                root2 = (-bValue - Math.sqrt(discriminant)) / (2 * aValue);
                if (root1 < 0) {
                    System.out.println("The root of this equation is: " + root1);
                } else {
                    if (root2 < 0) {
                        System.out.println("The root of this equation is: " + root2);
                    }
                    System.out.print("The roots of this equation are: " + root1 + " & " + root2);
                }
            } else {
                if (discriminant > 0) {
                    root1 = (-bValue + Math.sqrt(discriminant)) / (2 * aValue);
                    root2 = (-bValue - Math.sqrt(discriminant)) / (2 * aValue);
                    System.out.print("The roots of this equation are: " + root1 + " & " + root2);

                }
            }
        }
        input.close();
    }
}
