
import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String userInput = input.nextLine();
        int vowelCount = 0;

        for (int i = 0; i < userInput.length(); i++) {
            char c = userInput.charAt(i);
            if (c == 97 || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vowelCount++;
            }
        }
        input.close();
        System.out.println("The number of vowels in the string is: " + vowelCount);
    }
}
