import java.util.*;
import java.lang.String;

public class AccountSetUp {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a username: ");
        String username = input.nextLine();
        int passwordLength;
        String password;

        do {
            System.out.print("Please input a password that is at least 8 characters: ");
            password = input.nextLine();
            passwordLength = password.length();
        } while (passwordLength < 8);
        
        System.out.print("Your username is " + username.toLowerCase() + " and your password is " + password.toLowerCase());
    }
}