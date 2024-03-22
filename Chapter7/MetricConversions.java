
import java.util.*;

public class MetricConversions {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double conversion = 0, startingUnit = 0, endingUnit = 0;
        int conversionFactor = 0;
        System.out.println("What would you like to convert?");
        System.out.println("In to Cm (1)");
        System.out.println("Ft to Cm (2)");
        System.out.println("Yd to M (3)");
        System.out.println("Mi to Km (4)");
        System.out.println("Cm to In (5)");
        System.out.println("Cm to Ft (6)");
        System.out.println("M to Y (7)");
        System.out.println("Km to M (8)");
        conversionFactor = input.nextInt();

        switch (conversionFactor) {
            case 1:
                inToCm(startingUnit, endingUnit, conversion);
                break;
            case 2:
                ftToCm(startingUnit, endingUnit, conversion);
                break;
            case 3:
                ydToM(startingUnit, endingUnit, conversion);
                break;
            case 4:
                miToKm(startingUnit, endingUnit, conversion);
                break;
            case 5:
                cmToIn(startingUnit, endingUnit, conversion);
                break;
            case 6:
                cmToFt(startingUnit, endingUnit, conversion);
                break;
            case 7:
                mToY(startingUnit, endingUnit, conversion);
                break;
            case 8:
                kmToM(startingUnit, endingUnit, conversion);
                break;
        }
    }
/*All of the following methods start by getting a conversion factor of one unit to the next, then they do whatever calculation is necasasary
to convert said unit to the next unit*/
    public static void inToCm(double startingUnit, double endingUnit, double conversion) {
        conversion = 2.54;
        System.out.println("Please input the number of inches you would like to convert to centimeters");
        startingUnit = input.nextInt();
        endingUnit = conversion * startingUnit;
        System.out.println(startingUnit + " inches is " + endingUnit + " cm");

    }

    public static void ftToCm(double startingUnit, double endingUnit, double conversion) {
        conversion = 30;
        System.out.println("Please input the number of feet you would like to convert to centimeters");
        startingUnit = input.nextInt();
        endingUnit = conversion * startingUnit;
        if (startingUnit == 1) {
            System.out.println(startingUnit + " foot is " + endingUnit + " cm");
        } else {
            System.out.println(startingUnit + " feet is " + endingUnit + " cm");
        }
    }

    public static void ydToM(double startingUnit, double endingUnit, double conversion) {
        conversion = .91;
        System.out.println("Please input the number of yards you would like to convert to meters");
        startingUnit = input.nextInt();
        endingUnit = conversion * startingUnit;
        System.out.println(startingUnit + " yards is " + endingUnit + " meters");

    }

    public static void miToKm(double startingUnit, double endingUnit, double conversion) {
        conversion = 1.6;
        System.out.println("Please input the number of miles you would like to convert to kilometers");
        startingUnit = input.nextInt();
        endingUnit = conversion * startingUnit;
        System.out.println(startingUnit + " miles is " + endingUnit + " kilometers");

    }

    public static void cmToIn(double startingUnit, double endingUnit, double conversion) {
        conversion = 2.54;
        System.out.println("Please input the number of centimeters you would like to convert to inches");
        startingUnit = input.nextInt();
        endingUnit = startingUnit / conversion;
        System.out.println(startingUnit + " centimeters is " + endingUnit + " inches");

    }

    public static void cmToFt(double startingUnit, double endingUnit, double conversion) {
        conversion = 30;
        System.out.println("Please input the number of centimeters you would like to convert to feet");
        startingUnit = input.nextInt();
        endingUnit = startingUnit / conversion;
        System.out.println(startingUnit + " centimeters is " + endingUnit + " feet");
    }

    public static void mToY(double startingUnit, double endingUnit, double conversion) {
        conversion = .91;
        System.out.println("Please input the number of meters you would like to convert to yards");
        startingUnit = input.nextInt();
        endingUnit = startingUnit / conversion;
        System.out.println(startingUnit + " meters is " + endingUnit + " yards");
    }

    public static void kmToM(double startingUnit, double endingUnit, double conversion) {
        conversion = 1.6;
        System.out.println("Please input the number of kilometers you would like to convert to miles");
        startingUnit = input.nextInt();
        endingUnit = startingUnit / conversion;
        System.out.println(startingUnit + " kilometers is " + endingUnit + " miles");
    }

}
