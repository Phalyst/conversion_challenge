package com.playsafe.conversion.controller;

import com.playsafe.conversion.dto.ConvertRequest;
import com.playsafe.conversion.dto.ConvertResponse;
import com.playsafe.conversion.service.ConversionServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/conversions")
public class ConversionResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConversionResource.class);
    @Autowired
    private ConversionServiceImpl conversionService;

    public ResponseEntity<ConvertResponse> kelvinToCelsius(@Valid @RequestBody ConvertRequest request) {

        ConvertResponse response = new ConvertResponse();
        response.setResult(conversionService.convertKelvinToCelsius(request.getInput()));
        return new ResponseEntity<>(response, HttpStatus.OK);
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
