package com.playsafe.conversion.service;

import org.springframework.stereotype.Service;

@Service
public class ConversionServiceImpl implements ConversionService{
    @Override
    public double convertKelvinToCelsius(double kelvin) {
        return (kelvin - KELVIN_CELSIUS_CONSTANT);
    }

    @Override
    public double convertCelsiusToKelvin(double celsius) {
        return (celsius + KELVIN_CELSIUS_CONSTANT);
    }

    @Override
    public double convertMilesToKilometers(double miles) {
        return miles * MILE_KILOMETER_CONSTANT;
    }

    @Override
    public double convertKilometersToMiles(double km) {
        return km / MILE_KILOMETER_CONSTANT;
    }
}
