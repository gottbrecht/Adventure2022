package org.example;

public class RangedWeapon extends Weapon {
    public RangedWeapon(String itemName, String itemDescription, double damageLevel) {
        super(itemName, itemDescription, damageLevel);
    }
    public int getAmmunition() {
        return ammunition;
    }
    public boolean canUse() {
        if(ammunition <= 0) {
            return false;
        }else {
            return true;
        }
    }

    /*@Override
        public void useAmmo() {
        ammunition--;*/
    }

}
