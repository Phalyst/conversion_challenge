package com.playsafe.conversion.service;

import org.springframework.stereotype.Component;

@Component
public interface ConversionService {

    double KELVIN_CELSIUS_CONSTANT = 273.15;

    double MILE_KILOMETER_CONSTANT = 1.6;

    double convertKelvinToCelsius(double kelvin);

    double convertCelsiusToKelvin(double celsius);

    double convertMilesToKilometers(double miles);

    double convertKilometersToMiles(double km);
}
