package org.example;

import java.util.Scanner;

public class UserInterface {
    Map map = new Map();
    Food food = new Food("", "", 30);

    Room room = new Room("", ".");
    Player player = new Player();

    public void run() {

        Scanner scanner = new Scanner(System.in);
        Adventure adventure = new Adventure(player);
        player.setCurrentroom(adventure.map.getStartRoom());

        System.out.println(" Welcome to the Pimp My Ride game!");
        System.out.println(" Description:" +
                "\n In order to upgrade your trashy car,you need to explorer 9 different areas, " +
                "\n and enter the areas where you can gather gadgets or components." +
                "\n When you enter the last area, which is your goal of the game,you enter House Of Diamonds." +
                "\n Along the game, you get the fancy upgrades, like a new speaker, or the golden wheels." +
                "\n You can type 'north', 'south', 'east' or 'west', in order to move around." +
                "\n You may have to go to another direction, when you encounter: 'you can't go this way.' " +
                "\n You may type 'look', when you need to check where you are now." +
                "\n Type'help' when you need some assistance." +
                "\n Type'take'and the name of the component or upgrating method, in order to upgrade your car." +
                "\n Type'eat'and the name of the food you want eat,in order to get the health points." +
                "\n A long the game you will meet monsters that you have to get rid of! Type 'take weapon'." +
                "\n Type'drop'and the name of the item you want drop,when you need to remove one or more items." +
                "\n If you want to end the game, just press exit. Enjoy your game!");

        System.out.println(" You are here:");
        System.out.println(player.getCurrentRoom().getDescription());
        System.out.println(" Which direction do you like to go?");

        do {
            Scanner sc = new Scanner(System.in);
            String playerInput = scanner.nextLine();
            playerInput = playerInput.toLowerCase();

            String[] words = playerInput.split(" ");

            String verb = words[0];
            String noun = getNoun(words);


            switch (verb) {
                case "go":

                    break;

                case "north", "n":
                    if (adventure.north(player)) {
                        System.out.println(player.getCurrentRoom().getDescription());
                    } else
                        System.out.println("You can not go that way!");
                    break;

                case "east":
                    if (adventure.east(player)) {
                        System.out.println(player.getCurrentRoom().getDescription());
                    } else
                        System.out.println("You can not go that way!");
                    break;

                case "south":
                    if (adventure.south(player)) {
                        System.out.println(player.getCurrentRoom().getDescription());
                    } else
                        System.out.println("You can not go that way!");
                    break;

                case "west":
                    if (adventure.west(player)) {
                        System.out.println(player.getCurrentRoom().getDescription());
                    } else
                        System.out.println("You can not go that way!");
                    break;

                case "help":
                    System.out.println("What do you need help with?\n1. Money issues \n2. Tell me that I am handsome");
                    int choice = scanner.nextInt();
                    scanner.nextLine();//Scanner bug
                    if (choice == 1) {
                        System.out.println("Go back to garage and work hard in order to earn money.");
                    } else if (choice == 2) {
                        System.out.println("You are handsome.");
                    } else {
                        System.out.println("You have not entered the correct answer!"); //not done

                    }
                    break;

                case "look":
                    System.out.println("look");
                    System.out.println("You are in: " + room.getName());
                    System.out.println(player.getCurrentRoom());
                    System.out.println(room.getDescription());
                    break;
                case "exit":
                    System.out.println("Exit - ending game");

                    break;

                case "take", "Take": {
                    String itemName = noun;
                    Item itemTaken = player.getCurrentRoom().getItem(itemName);
                    if (itemTaken == null) {
                        System.out.println("It is not found in the room.");
                    } else {
                        System.out.println("you have taken " + itemTaken);
                        player.addItem(itemTaken);
                        player.getCurrentRoom().getItems().remove(itemTaken);
                    }
                }
                break;

                case "drop", "Drop", "remove", "Remove": {
                    String itemName = noun;
                    boolean droppedItem = player.dropItem(itemName);
                    if (droppedItem == false) {
                        System.out.println("It it not found in this room.");
                    } else {
                        System.out.println("You have drop off" + player.droppetItem());
                    }
                }
                break;

                case "eat", "Eat": {
                    for (Item item : player.getCurrentRoom().getItems()
                    ) {
                        if (item instanceof Food) {
                            System.out.println("You have eaten " + item);
                            System.out.println("This gives you:" + food.getHealth() + "health points.");
                        } else {
                            System.out.println("There is no food in the room.");
                        }

                    }
                }
               break;
             /* case "eat", "Eat": {
                    String itemName = noun;
                    Item itemTaken = player.getCurrentRoom().getItem(itemName);
                    if (itemTaken == null) {
                        System.out.println("You cannot eat that.");
                    } else {
                        System.out.println("you have eaten" + itemTaken + "You have gained" + food.getHealth() + "health points.");
                        player.addItem(itemTaken);
                        player.getCurrentRoom().getItems().remove(itemTaken);
                    }
                }
                break; */

                    /*if (player.getCurrentRoom().getItems() == Player.eatFood.EATAN) {
                        System.out.println("You have eaten" + player.getCurrentRoom().getItem());
                        System.out.println("This gives you:" + food.getHealth() + "health points.");
                    }
                else if (eatFood == Player.eatFood.NOT_FOOD){
                    System.out.println(player.getCurrentRoom().getItem()+"is not eatable.");
                } else (eatFood==Player.eatFood.NOT_FOUND) {
                    System.out.println("No food named that has been found.");
                }*/


                case "inventory", "Inventory": {
                    System.out.println("These items are in your inventory: " + adventure.getPlayer().findItemInInventory(""));
                }

            }

        } while (true) ;
    }
    private String getNoun (String[]words){
        String noun = " ";
        for (int i = 1; i < words.length; i++) {
            noun += " " + words[i];
        }
        return noun.trim();
    }
}








