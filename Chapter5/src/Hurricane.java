import java.util.*;

public class Hurricane {
    public static void main(String[] args) {
        int hurricaneCat;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the category of the Hurricane: Cat ");
        hurricaneCat = input.nextInt();

        switch (hurricaneCat) {
            case 1:
                System.out.print("74-95 mph or 64-82 kt or 119-153 km/hr ");
                break;
            case 2:
                System.out.print(": 96-110 mph or 83-95 kt or 154-177 km/hr");
                break;
            case 3:
                System.out.print("111-130 mph or 96-113 kt or 178-209 km/hr");
                break;
            case 4:
                System.out.print("131-155 mph or 114-135 kt or 210-249 km/hr");
                break;
            case 5:
                System.out.print("Greater than 155 mph or 135 kt or 249 km/hr");
                break;
        }
        input.close();
    }
}
