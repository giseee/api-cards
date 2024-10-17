package com.eldar.ejercicio2.dto;

public class OperationResponse {
    private String brand;
    private double rate;

    public OperationResponse() {
    }
    public OperationResponse(String brand, double rate) {
        this.brand = brand;
        this.rate = rate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "OperationResponse{" +
                "Marca='" + brand + '\'' +
                ", Importe total=" + rate +
                '}';
    }
}
