public class PerfectIntegers {
    public static void main(String[] args) {
        boolean isPerfect = false;

        for (int i = 1; i < 100; i++) {
            isPerfect = isPerfect(i);

            if (isPerfect) {
                System.out.println(i);
            }
        }

    }

    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0 && num != i){
                sum += i;
            }
        }
        if (sum == num) {
            return (true);
        } else {
            return (false);
        }

    }
}
