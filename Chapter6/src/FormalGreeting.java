import java.util.*;
import java.lang.String;

public class FormalGreeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name and suffix if you don't have a suffix just enter your name: ");
        String name = input.nextLine();
        String suffix1 = "mr." ;
        String suffix2 = "mrs.";
        String suffix3 = "miss.";
        String suffix4 = "ms.";
        
        if (name.toLowerCase().startsWith(suffix1)) {
            System.out.println("Hello, Sir");
        } else if (name.toLowerCase().startsWith(suffix2)) {
            System.out.println("Hello, Ma'am");
        } else if (name.toLowerCase().startsWith(suffix3)) {
            System.out.println("Hello, Ma'am");
        } else if (name.toLowerCase().startsWith(suffix4)) {
            System.out.println("Hello, Ma'am");
        } else {
            System.out.println("Hello, " + name);
        }
        input.close();
    }
}
