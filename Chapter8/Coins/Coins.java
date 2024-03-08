package Chapter8.Coins;
public class Coins {
    public static void main(String[] args) {
        Coin nickel = new Coin();

        if (nickel.showFace() == 0) {
            System.out.println("Heads up!");
        } else {
            System.out.println("Tails up!");
        }
    }
}
