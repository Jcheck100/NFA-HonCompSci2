
import java.util.Scanner;

public class Monogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter your middle initial: ");
        String middleName = input.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();

        String monogram = firstName.substring(0, 1).toLowerCase() + lastName.substring(0, 1).toUpperCase()
                + middleName.substring(0, 1).toLowerCase();
                input.close();
        System.out.println("Your monogram is: " + monogram);
    }
}
