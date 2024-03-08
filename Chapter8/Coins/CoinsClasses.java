package Chapter8.Coins;

import java.util.*;

class Coin {

    private int faceUp; // initalizes the heads or tails variable 0 for heads 1 (or anything else) for tails

    public Coin() { //calls the flipCoin method for whatever object that you define as a "Coin"
        flipCoin();
    }

    public void flipCoin() { // "flips" the coin (sets faceUp to 1 or 0)
        Random random = new Random();
        faceUp = random.nextInt(2);
    }

    public int showFace() { //sends value of face up (1 or 0) to main method
        return faceUp;

    }

    
}
