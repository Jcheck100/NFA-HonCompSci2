import java.lang.String;
import java.util.Scanner;

public class Password {

    public static void main(String[] args) throws Exception {
        String password = "i";
        String userInput;
        int counter = 0;
        Scanner input = new Scanner(System.in);

       do{
        System.out.println("Please enter your password");
        userInput = input.nextLine();
            if (userInput.equals(password)) {
                System.out.println("Welcome");
                System.exit(0);
            } else
                System.out.println("The password you entered is incorrect");
                counter += 1;
            }while (counter < 3);
            input.close();
        }
    }
