import java.util.Scanner;

public class ETC {

    public static void main(String[] args) {

        int hour;
        int time;
        int total;
        String day;
        boolean afternoon = false;

        Scanner input = new Scanner(System.in);

            afternoon = false;
            System.out.println("Enter the starting hour: ");
            hour = input.nextInt();
        

        do {
            System.out.println("Enter am or pm: ");
            day = input.next();
            if (day.equals("pm")) {
                afternoon = true;
            }
        } while (!day.equals("am") && !day.equals("pm"));

            System.out.println("Enter the number of elapsed hours: ");
            time = input.nextInt();

        total = hour + time;

        while (total >= 11) {
            if (afternoon == true) {
                afternoon = false;
                day.equals("am");
            } else if (afternoon == false) {
                afternoon = true;
                day.equals("pm");
            }

            total = total - 12;
        }

        if (total == 0) {
            total = 12;
        }

        if (afternoon == false) {
            System.out.println("The current time is: " + total + ":00 am");
        } else if (afternoon == true) {
            System.out.println("The current time is: " + total + ":00 pm");
        }
        input.close();
    }
}