import java.util.*;

public class MathTutor {
    public static void main(String[] args) {
        int randomNumber1;
        int randomNumber2;
        int operand;
        int userInput;
        Random tempRandomNumber1 = new Random();
        Random tempRandomNumber2 = new Random();
        Random tempoperand = new Random();
        final int max = 10;
        final int min = 1;
        final int operandMax = 4;
        final int operandMin = 1;
        final double answer;
        final int mult = 1, add = 2, sub = 3, div = 4;
        Scanner input = new Scanner(System.in);

        randomNumber1 = tempRandomNumber1.nextInt(max - min + 1) + min;
        randomNumber2 = tempRandomNumber2.nextInt(max - min + 1) + min;
        operand = tempoperand.nextInt(max - min + 1) + min;

        if (operand == mult) {
            answer = (randomNumber1 * randomNumber2);
            System.out.println("What is: " + randomNumber1 + " * " + randomNumber2);
            userInput = input.nextInt();
            if (userInput == answer) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect");
            }
        } else {
            if (operand == div) {
                answer = (randomNumber1 / randomNumber2);
                System.out.println("What is: " + randomNumber1 + "/" + randomNumber2);
                userInput = input.nextInt();
                if (userInput == answer) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect");
                }
            } else {
                if (operand == add) {
                    answer = (randomNumber1 + randomNumber2);
                    System.out.println("What is: " + randomNumber1 + " + " + randomNumber2);
                    userInput = input.nextInt();
                    if (userInput == answer) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println("Incorrect");
                    }
                } else {
                    if (operand == sub) {
                        answer = (randomNumber1 - randomNumber2);
                        System.out.println("What is: " + randomNumber1 + " - " + randomNumber2);
                        userInput = input.nextInt();
                        if (userInput == answer) {
                            System.out.println("Correct!");
                        } else {
                            System.out.println("Incorrect");
                        }
                    }
                }
            }
        }
    }
}
