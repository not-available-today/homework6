package com.company.triangle;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10,10,10);

        System.out.println("Triangle area: " + triangle.calculateArea());
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
    }
}
