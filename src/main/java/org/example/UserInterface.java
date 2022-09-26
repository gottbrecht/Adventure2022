package org.example;

import java.util.Scanner;
public class UserInterface {

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the org.example.Adventure game!");
        System.out.println("Please choose from the menu.");
        System.out.println("1. Start the game\n2.Introduction of the game\n9.Exit game");

       switch (scanner.nextInt()) {
            case 1:
                System.out.println("Go North");
                break;
            case 2:
                System.out.println("Go East");
                break;
            case 3:
                System.out.println("Go South");
                break;
            case 4:
                System.out.println("Go West");
            case 5:
                System.out.println("Help");
                break;
            case 6:
                System.out.println("Look");
                break;
            case 7:
                System.out.println("Exit");
                break;
           case 8:
               System.out.println("Where are you going?");
               break;
        }
    }
}