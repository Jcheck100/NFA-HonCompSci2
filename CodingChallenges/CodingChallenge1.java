import java.util.*;

public class CodingChallenge1 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int userNum;
        do {
            System.out.print("Please input a number: ");
            userNum = input.nextInt();
        } while (userNum <= 0);
        
        for (int i = 0; i <= userNum; i+=2) {
            if (i % 4 == 0 && i % 6 == 0) {
                continue;
            } else if (i % 4 == 0 || i % 6 == 0) {
                System.out.println(i);
            }
        }
    }

}
