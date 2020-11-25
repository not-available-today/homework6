package com.company.circle;

public class Circle {
    //region Properties
    private double radius;
    //endregion

    //region Constructors
    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }
    //endregion

    //region GettersAndSetters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    //endregion

    //region Public Methods

    public double  calculatePerimeter(){
        return Math.PI * radius * 2;

    }

    public double calculateArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    //endregion
}
