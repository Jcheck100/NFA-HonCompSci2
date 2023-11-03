package chapter6game;

public class Pokemon {
    public String name;
    public int health, strength, speed;

    Pokemon(String name) {
        this.name = name;
        this.health = 10;
        this.strength = 10;
    }

    public void damage(int damage) {
        this.health -= damage;
    }
}