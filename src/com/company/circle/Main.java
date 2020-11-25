package com.company.circle;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(20);

        System.out.println("Radius of the circle is " + circle.getRadius());
        System.out.println("Area of the circle is " + circle.calculateArea());
        System.out.println("Perimeter of circle is " + circle.calculatePerimeter());


    }
}
