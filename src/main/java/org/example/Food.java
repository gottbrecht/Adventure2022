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
    /*Item item = findItem(name);
    if(item==null) {
        return  Enum.NOT_FOUND;
    }else if (item instance of Food food/Weapon weapon){
    health = food.getHealth();
        return ENUM.EATEN;
        }else{
        return ENUM.NOT.FOOD;

        //the same weapon

     */


    @Override
    public String toString() {
        return super.toString() + " " + health;
    }

    public void add(Food food) {
    }
}
