package org.example;

public class Food extends Item {
    private int health;

    public Food(String itemName, String description, int health) {
        super(itemName, description);
        this.health = health;
    }

    public int getHealth() {
        return health;
    }


    @Override
    public String toString() {
        return super.toString() + " " + health;
    }
}
