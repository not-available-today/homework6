package com.company.convertDistance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Convertor convertor = new Convertor();
        Scanner scanner = new Scanner(System.in);
        boolean exitTime = false;
        while(!exitTime) {
            System.out.println("Press 1 to convert meters to miles\n" +
                    "Press 2 to convert meters to miles\n" +
                    "Press 3 to exit");
            int userInput = scanner.nextInt();
            if (userInput < 1 || userInput > 3) {
                System.out.println("That is not a valid choice, try again");
            }
            switch (userInput) {
                case 1:
                    System.out.println("Enter distance to be converted: ");
                    System.out.println(convertor.converMetersToMiles(scanner.nextDouble()));
                    continue;
                case 2:
                    System.out.println("Enter distance to be converted");
                    System.out.println(convertor.convertMilesToMeters(scanner.nextDouble()));
                    continue;
                case 3:
                    exitTime = true;

            }
        }
        System.out.println("Good bye.");
    }
}
