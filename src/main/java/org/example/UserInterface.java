package org.example;

import java.util.Scanner;
public class UserInterface {

    public void start() {
        Scanner scanner = new Scanner(System.in);
        Adventure adventure = new Adventure();

        System.out.println("Welcome to the Car game!");
        System.out.println("Description: in order to find the components to upgrade your sports car, you need to " +
                "explorer the 9 different areas, and enter the areas where you can gather money or components. " +
                "When you enter the last area, which is your goal of the game, you could gather the best components " +
                "and the fancy upgrades, like a new steering wheel, or golden wheels." +
                "You can choose to go north, south, east or west. You may also choose to look, or ask for help. " +
                "If you want to end the game, just press exit. Enjoy your game!");

        do {
            String playerInput = scanner.nextLine();
            playerInput = playerInput.toLowerCase();
            switch (playerInput) {
                case "go north", "north":
                    System.out.println("Going north");
                    break;
                case "go east", "east":
                    System.out.println("Going east");
                    break;
                case "go south", "south":
                    System.out.println("Going south");
                    break;
                case "go west", "west":
                    System.out.println("Going west");
                    break;
                case "help":
                    System.out.println("help");
                    break;
                case "look":
                    System.out.println("look");
                    System.out.println("You are in: " +adventure.getCurrentRoom().getName());
                    System.out.println(adventure.getCurrentRoom().getDescription());
                    break;
                case "exit":
                    System.out.println("Exit - ending game");
                    break;
            }
        } while (true);
    }

}