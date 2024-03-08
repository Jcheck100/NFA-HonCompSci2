public class Coin {
    public static void main(String[] args) {
        Coin nickel = new Coin();
        if (nickel.flipCoin() == 0) {
            System.out.println("Heads up!");
        } else {
            System.out.println("Tails up!");
        }
    }
}
