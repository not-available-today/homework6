package com.company.pointDistance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input coordinates for point 1: ");
        Point point = new Point(scanner.nextDouble(), scanner.nextDouble());

        System.out.println("Distance between point 1 and 0: ");
        System.out.println(point.getDistance());

        System.out.println("Input coordinates for point 2: ");
        Point point1 = new Point(scanner.nextDouble(), scanner.nextDouble());

        System.out.println("Distance between point 2 and 0: ");
        System.out.println(point1.getDistance());

        System.out.println("Distance between point 1 and point 2: ");
        System.out.println(point.getDistance(point, point1));
    }

}
