package org.example;

import org.example.Item;

import java.util.ArrayList;

public class Weapon extends Item {

    private double damageLevel;

    //ArrayList<org.example.Weapon> org.example.Weapon = new ArrayList<>();

    public double getDamageLevel() {
        return damageLevel;
    }
    public Weapon (String itemName, String itemDescription, double damageLevel) {
        super(itemName, itemDescription);
        this.damageLevel = damageLevel;
    }
}
