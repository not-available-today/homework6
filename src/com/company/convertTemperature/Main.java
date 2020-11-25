package com.company.convertTemperature;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Convertor convertor = new Convertor();
        boolean exitTime = false;
        while (!exitTime) {
            System.out.println("---------------------------------\n" +
                    "1 - convert Fahrenheit to Celsius\n" +
                    "2 - convert Fahrenheit to Kelvin\n" +
                    "3 - convert Celsius to Fahrenheit\n" +
                    "4 - convert Celsius to Kelvin\n" +
                    "5 - convert Kelvin to Fahrenheit\n" +
                    "6 - convert Kelvin to Celsius\n" +
                    "7 - exit\n" +
                    "---------------------------------");
            int userChoice = scanner.nextInt();
            if (userChoice < 1 || userChoice > 7) {
                System.out.println("That is not a valid choice");
                continue;
            }
            switch (userChoice) {
                case 1:
                    System.out.println("enter temperature to convert from F to C: ");
                    System.out.println(convertor.convertFahrenheitToCelsius(scanner.nextDouble()));
                    continue;
                case 2:
                    System.out.println("enter temperature to convert from F to K: ");
                    System.out.println(convertor.convertFahrenheitToKelvin(scanner.nextDouble()));
                    continue;
                case 3:
                    System.out.println("enter temperature to convert from C to F: ");
                    System.out.println(convertor.convertCelsiusToFahrenheit(scanner.nextDouble()));
                    continue;
                case 4:
                    System.out.println("enter temperature to convert from C to K: ");
                    System.out.println(convertor.convertCelsiusToKelvin(scanner.nextDouble()));
                    continue;
                case 5:
                    System.out.println("enter temperature to convert from K to F: ");
                    System.out.println(convertor.convertKelvinToFahrenheit(scanner.nextDouble()));
                    continue;
                case 6:
                    System.out.println("enter temperature to convert from K to C: ");
                    System.out.println(convertor.convertKelvinToCelsius(scanner.nextDouble()));
                    continue;
                case 7:
                    exitTime = true;

            }
        }
        System.out.println("Good bye.");
    }
}
