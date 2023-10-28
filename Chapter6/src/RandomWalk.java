
import java.util.Random;

public class RandomWalk {
    public static void main(String[] args) {
        Random random = new Random();
        int totalSteps = 0;
        int maxSteps = 0;

        for (int i = 0; i < 50; i++) {
            int steps = 0;
            int position = 0;

            while (position >= -3 && position <= 3) {
                double direction = random.nextDouble();
                position += direction < 0.5 ? -1 : 1;
                steps++;
            }

            totalSteps += steps;
            maxSteps = Math.max(maxSteps, steps);
        }

        double averageSteps = (double) totalSteps / 50;
        System.out.println("Average steps: " + averageSteps);
        System.out.println("Max steps: " + maxSteps);
    }
}
