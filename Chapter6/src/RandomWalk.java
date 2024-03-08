
public class RandomWalk {
    public static void main(String[] args) {

        int startingPoint, Count, mostSteps=0;
        double randomStep, averageSteps = 0, totalSteps = 0;

        for (int trials = 0; trials < 50; trials++) {
            Count = 0;
            startingPoint = 0;

            while (Math.abs(startingPoint) <= 3.5) {
                randomStep = (10 - (-10)) * Math.random() + -10;
                Count += 1;
                if ((int) randomStep >= 0) {
                    startingPoint += 1;
                } else {
                    startingPoint -= 1;
                }
                if (mostSteps < Count) {
                    mostSteps = Count;
                }
            }

            totalSteps += Count;
        }

        averageSteps = totalSteps / 50;
        System.out.println("The most steps taken was: " + mostSteps);
        System.out.println("The average amount of steps taken was: " + averageSteps);
    }
}