import java.util.Scanner;

public class Stages {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;

        System.out.println("Enter your age: ");
        age = input.nextInt();
        input.close();
        if (age > 18) {
            System.out.print("You're an adult");
        } else if (age <= 5) {
            System.out.print("Toddler");
        } else if (age <= 10) {
            System.out.print("Child");
        } else if (age <= 12) {
            System.out.print("Preteen");
        } else if (age > 12) {
            System.out.print("Teen");
        }

    }

}