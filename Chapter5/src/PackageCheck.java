import java.util.*;

public class PackageCheck {
    public static void main(String[] args) {
        int weight;
        int width;
        int height;
        int length;
        int volume;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the weight of the packege (kg): ");
        weight = input.nextInt();
        System.out.print("Please enter the width of the packege (cm): ");
        width = input.nextInt();
        System.out.print("Please enter the height of the packege (cm): ");
        height = input.nextInt();
        System.out.print("Please enter the length of the packege (cm): ");
        length = input.nextInt();

        volume = (length * width * height);

        if (volume >= 100000 && weight >= 27) {
            System.out.println("Your package is too wide and too heavy");
        } else if (volume >= 100000) {
            System.out.println("Your package is too wide");
        } else if (weight >= 27) {
            System.out.println("Your package is too heavy");
        } else {
            System.out.println("Package can be shipped!");
        }
            
        input.close();
        
    }
}
