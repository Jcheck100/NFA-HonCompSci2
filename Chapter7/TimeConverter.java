import java.util.*;

public class TimeConverter {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double minutes = 0;
        double hours = 0;
        double days = 0;
        double conversion = 0;
        int conversionFactor;
        System.out.println("What would you like to convert?");
        System.out.println("Hours to Minutes (1)");
        System.out.println("Days to Hours (2)");
        System.out.println("Minutes to Hours (3)");
        System.out.println("Hours to Days (4)");
        conversionFactor = input.nextInt();

        switch (conversionFactor) {
            case 1:
                hoursToMinutes(minutes, hours, conversion);
            case 2:
                daysToHours(days, hours, conversion);
            case 3:
                minutesToHours(minutes, hours, conversion);
            case 4:
                hoursToDays(minutes, hours, conversion);
        }
    }

    public static void hoursToMinutes(double minutes, double hours, double conversion) {
        System.out.println("Please input the number of hours you would like to convert to minutes:");
        hours = input.nextDouble();
        conversion = hours * 60;
        System.out.println(hours + " hours is: " + conversion + " minutes ");
    }

    public static void daysToHours(double days, double hours, double conversion) {
        System.out.println("Please input the number of hours you would like to convert to minutes:");
        days = input.nextDouble();
        conversion = days * 24;
        System.out.println(days + " days is: " + conversion + " hours ");
    }

    public static void minutesToHours(double minutes, double hours, double conversion) {
        System.out.println("Please input the number of minutes you would like to convert to hours:");
        minutes = input.nextDouble();
        conversion = minutes/60 ;
        System.out.println(minutes + " minutes is: " + conversion + " hours ");
    }

    public static void hoursToDays(double days, double hours, double conversion) {
        System.out.println("Please input the number of hours you would like to convert to days:");
        hours = input.nextDouble();
        conversion = hours/24;
        System.out.println(hours + " hours is: " + conversion + " days ");
    }
}
