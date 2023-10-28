import java.lang.*;
import java.util.*;

public class UnknownGame {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Random randomNumber = new Random();
        int playerHealth, playerSpeed, playerStrenth, playerLevel = 1, playerEXP = 0, skillPoints = 5,
                moveSelection = 0;
        int enemyHealth, enemySpeed = 0, enemyStrength = 0, enemyStatTotal = 0, enemyMoveSelection = 0;
        int min = 1, max = 7;
        String playerName;
        int Ember = 1, Scratch = 2, BubbleBeam = 3, Headbutt = 4;

        System.out.print("Please enter a name for your character: ");
        playerName = input.nextLine();

        // player chooses thier starting stats
        System.out.println(playerName + " please allocate 5 skill points");

        do {
            System.out.print("Speed (decides who moves first): ");
            playerSpeed = input.nextInt();
            skillPoints -= playerSpeed;
            System.out.print("Health (Val multipled by 50): ");
            playerHealth = input.nextInt();
            skillPoints -= playerHealth;
            System.out.print("Strength  (Amplifies the power of your moves): ");
            playerStrenth = input.nextInt();
            skillPoints -= playerStrenth;
            if (skillPoints < 0) {
                System.out.println("You used more than 5 points, please redo you skills");
                skillPoints = 5;
            }

        } while (skillPoints > 0);

        playerHealth = (playerHealth * 50) + 100;

        System.out.println("A strange creature jumps out of a nearby bush!");
        System.out.println("Battle Start!");

        enemyHealth = randomNumber.nextInt((max - min + 1) + min);
        max -= enemyHealth;
        enemySpeed = randomNumber.nextInt((max - min + 1) + min);
        max -= enemySpeed;
        enemyStrength = randomNumber.nextInt((max - min + 1) + min);
        max -= enemyStrength;

        enemyStatTotal = enemyHealth + enemySpeed + enemyStrength;
        enemyHealth *= 50; 
        enemyHealth += 100;

        Battle(playerHealth, playerStrenth, playerSpeed, enemyHealth, enemySpeed,
                enemyStrength, enemyMoveSelection, Ember, Scratch, Headbutt, BubbleBeam, moveSelection, input,
                randomNumber);

    }

    // decides an enemys stats
    static void EnemyStats(int enemyHealth, int enemySpeed, int enemyStrength,
            int min, int max, Random randomNumber,
            int enemyStatTotal) {
        enemyHealth = randomNumber.nextInt((max - min + 1) + min); // uses a max and min instead of hard set values so
                                                                   // we can change the number passed through later
        max -= enemyHealth;
        enemySpeed = randomNumber.nextInt((max - min + 1) + min);
        max -= enemySpeed;
        enemyStrength = randomNumber.nextInt((max - min + 1) + min);
        max -= enemyStrength;
    }

    static void Battle(int playerHealth, int playerStrength, int playerSpeed, int enemyHealth, int enemySpeed,
            int enemyStrength, int enemyMoveSelection, int Ember, int Scratch, int Headbutt, int BubbleBeam,
            int moveSelection, Scanner input, Random randomNumber) {

        boolean playerTurn = true;

        if (playerSpeed < enemySpeed) {
            playerTurn = false; // Enemy would be faster, so they move first
        }
        while (playerHealth > 0 && enemyHealth > 0) {
            if (playerTurn) {
                 // Check if the enemy's health is already at or below zero
                if (enemyHealth <= 0) {
                    System.out.println("You won the battle! Congratulations!");
                    break; // Exit the loop
                }

                System.out.println("It's your turn. What move do you choose? Creature's health: " + enemyHealth + "Your Health: " + playerHealth);
                System.out.println(
                        "\n" + "Ember (To use type 1, base 50 dmg)" + "\n" + "Scratch (To use type 2, base 25 dmg)"
                                + "\n" + "BubbleBeam (To use type 3, base 10 dmg)" + "\n"
                                + "Headbutt (To use type 1, base 30 dmg)" + "\n");
                moveSelection = input.nextInt();

                switch (moveSelection) {
                    case 1:
                        enemyHealth -= (50 * ((double) playerStrength / 10)) + 50;
                        System.out.println("You use Ember on the strange creature! Creature's health: " + enemyHealth);
                        break;
                    case 2:
                        // Handle Scratch
                        break;
                    case 3:
                        // Handle BubbleBeam
                        break;
                    case 4:
                        // Handle Headbutt
                        break;
                    default:
                        System.out.println("Invalid move, please input a move 1-4");
                        continue; // Repeat the player's turn
                }

                // Enemy's turn
                enemyMoveSelection = randomNumber.nextInt(4) + 1;

                 if (enemyHealth <= 0) {
                    System.out.println("You won the battle! Congratulations!");
                    break; // Exit the loop
                 }

                switch (enemyMoveSelection) {
                    case 1:
                        playerHealth -= (50 * ((double) enemyStrength / 10)) + 50;
                        System.out.println("The creature uses Ember on you! your Health: " + playerHealth);
                        break;
                    case 2:
                        playerHealth -= (25 * ((double) enemyStrength / 10)) + 50;
                        System.out.println("The creature uses Scratch on you! your Health: " + playerHealth);
                        break;
                    case 3:
                        playerHealth -= (10 * ((double) enemyStrength / 10)) + 50;
                        System.out.println("The creature uses Grass Knot on you! your Health: " + playerHealth);
                        break;
                    case 4:
                        playerHealth -= (30 * ((double) enemyStrength / 10)) + 50;
                        System.out.println("The creature uses GigaImpact on you! your Health: " + playerHealth);
                        break;
                }
            }

            playerTurn = !playerTurn; // Switch turns

            if (playerHealth <= 0) {
                System.out.println("Game Over");
            } else if (enemyHealth <= 0)
                System.out.println("You won the battle! Congratlations!");
        }

    }
}
