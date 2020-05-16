package com.playsafe.conversion.controller;

import com.playsafe.conversion.dto.ConvertRequest;
import com.playsafe.conversion.dto.ConvertResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/conversions")
public class ConversionResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConversionResource.class);

    public ResponseEntity<ConvertResponse> kelvinToCelsius(@Valid @RequestBody ConvertRequest request) {
        return null;
    }

    public ResponseEntity<ConvertResponse> celsiusToKelvin(@Valid @RequestBody ConvertRequest request) {
        return null;
    }

    public ResponseEntity<ConvertResponse> milesToKilometers(@Valid @RequestBody ConvertRequest request) {
        return null;
    }

    public ResponseEntity<ConvertResponse> kilometersToMiles(@Valid @RequestBody ConvertRequest request) {
        return null;
    }


}
