package com.playsafe.conversion.dto;

public class ConvertResponse {

    private double result;

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "ConvertResponse{" +
                "result=" + result +
                '}';
    }
}
