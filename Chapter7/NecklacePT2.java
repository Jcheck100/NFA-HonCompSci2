
public class NecklacePT2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                count(i, j);
            }
        }

    }

    public static void count(int i, int j) {

        int firstNum = i, lastNum = j, currentNum, firstNum2 = i, lastNum2 = j;
        int counter = 0;
        do {
            counter += 1;
            currentNum = (firstNum + lastNum) % 10;
            firstNum = lastNum;
            lastNum = currentNum;
            System.out.print(currentNum + " ");

        } while (firstNum != firstNum2 || lastNum != lastNum2);

        System.out.println("\nit took " + counter + " interations to close the necklace");

    }
}
