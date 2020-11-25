package com.company.pointDistance;

public class Point {

    //region Properties

    private double coordinateX;
    private double coordinateY;

    //endregion

    //region Constructors

    public Point() {
    }

    public Point(double x, double y) {
        this.coordinateX = x;
        this.coordinateY = y;
    }

    //endregion

    //region Public Methods
    public double getDistance() {
        return Math.sqrt(Math.pow(coordinateX, 2) + Math.pow(coordinateY, 2));
    }

    public double getDistance(Point xy1, Point xy2){
        double newX = xy2.getCoordinateX() - xy1.getCoordinateX();
        double newY = xy2.getCoordinateY() - xy1.getCoordinateY();
        return Math.sqrt(Math.pow(newX, 2) + Math.pow(newY, 2));
    }

    //endregion

    //region Setters and Getters

    public double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }


    //endregion

}
