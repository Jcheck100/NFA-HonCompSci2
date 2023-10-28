import java.util.Scanner;

public class ElaspedTimeClac {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the starting hour (1-12): ");
        int startHour = input.nextInt();

        System.out.println("Enter AM or PM: ");
        String startAmPm = input.next();

        System.out.println("Enter the number of elapsed hours: ");
        int elapsedHours = input.nextInt();

        int endHour = startHour + elapsedHours;
        String endAmPm = startAmPm;

        if (endHour > 12) {
            endHour -= 12;
            endAmPm = startAmPm.toLowerCase().equals("am") ? "pm" : "am";
        } else if (endHour == 12) {
            endAmPm = startAmPm.toLowerCase().equals("am") ? "am" : "pm";
        } else if (endHour == 11 && startAmPm.toLowerCase().equals("pm")) {
            endAmPm = "am";
        }

        System.out.println("The time after " + elapsedHours + " hours is " + endHour + " " + endAmPm);
    }
}


