package com.company.convertDistance;

public class Convertor {
    public double convertMilesToMeters(double distance){
        return distance * 1609.34;
    }
    public double converMetersToMiles(double distance){
        return distance / 1609.34;
    }
}
