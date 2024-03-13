import java.util.Scanner;

public class SurfsUp {
    public static void main(String[] args) {
        int waveHeight;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the height of the wave");
        waveHeight = input.nextInt();
        
        if (waveHeight >= 7) {
            System.out.println("great day for surfing");
        } else if ((waveHeight >= 3) && (waveHeight <= 6)){
            System.out.println("Go body boarding");
        } else if ((waveHeight >= 0) && (waveHeight <= 3)) {
            System.out.println("Go for a swim");
        } else {
            System.out.println("what kind of surf is that");
        }
        input.close();
    }
}