package com.company.rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(10);
        rectangle.setWidth(20);

        System.out.println("Rectangle height: " + rectangle.getHeight());
        System.out.println("Rectangle width:" + rectangle.getWidth());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Area: " + rectangle.calculateArea());

        Rectangle rectangleOne = new Rectangle(5, 10);

        System.out.println("Height & width of  rectangleOne: " + rectangleOne.getHeight() + " " + rectangleOne.getWidth());

        System.out.println("Perimeter: " + rectangleOne.calculatePerimeter());
        System.out.println("Area " + rectangleOne.calculateArea());
    }
}
