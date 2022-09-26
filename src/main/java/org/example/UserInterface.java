package org.example;

import java.util.Scanner;
public class UserInterface {

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the org.example.Adventure game!");
        System.out.println("Please choose from the meny.");
        System.out.println("1. Start the game\n2.Indroduction of the game\n9.Exit the game.");

        switch (scanner.nextInt()) {
            case 1:
                goNorth();
                break;
            case 2:
                goEast();
                break;
            case 3:
                goSouth();
                break;
            case 4:
                goWest();
            case 5:
                help();
                break;
            case 6:
                look();
                break;
            case 7:
                Exit();
                break;

            System.out.println("Where are you going?");
        }
    }
}
*/