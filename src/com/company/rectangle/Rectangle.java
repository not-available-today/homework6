package com.company.rectangle;

public class Rectangle {
    //region Properties
    private int height;
    private int width;
    //endregion

    //region Constructors
    public Rectangle() {
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }
    //endregion

    //region Public Methods

    public int calculatePerimeter(){
        return height * 2 + width * 2;
    }

    public int calculateArea(){
        return height * width;
    }

    //endregion

    //region Getters and Setters
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    //endregion

}
