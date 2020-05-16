package com.playsafe.conversion.dto;

public class ConvertRequest {
    private double input;

    public double getInput() {
        return input;
    }

    public void setInput(double input) {
        this.input = input;
    }

    @Override
    public String toString() {
        return "ConvertRequest{" +
                "input=" + input +
                '}';
    }
}
