package com.company.convertTemperature;

public class Convertor {


    //region Public Methods
    public double convertFahrenheitToCelsius(double temperature) {
        return (temperature - 32) * 1.8;
    }

    public double convertFahrenheitToKelvin(double temperature) {
        return (temperature - 32) * 1.8 + 273.15;
    }

    public double convertCelsiusToFahrenheit(double temperature) {
        return temperature * 1.8 + 32;
    }

    public double convertCelsiusToKelvin(double temperature) {
        return temperature + 273.15;
    }

    public double convertKelvinToFahrenheit(double temperature) {
        return (temperature - 273.15) * 1.8 + 32;
    }

    public double convertKelvinToCelsius(double temperature) {
        return temperature - 273.15;
    }
    //endregion


}
