import java.util.*;

public class Necklace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNum, firstNum2, lastNum, lastNum2, currentNum, counter = 0;

        System.out.println("Enter the first number");
        firstNum = input.nextInt();
        firstNum2 = firstNum;

        System.out.println("Enter the last number");
        lastNum = input.nextInt();
        lastNum2 = lastNum;

        System.out.print(firstNum + " " + lastNum2 + " ");
        do {
            counter += 1;
            currentNum = (firstNum + lastNum) % 10;
            firstNum = lastNum;
            lastNum = currentNum;
            System.out.print(currentNum + " ");

        } while (firstNum != firstNum2 || lastNum != lastNum2);
        input.close();
        System.out.println("it took " + counter + " interations to close the necklace");
    }
}