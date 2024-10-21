package com.eldar.ejercicio2.dto;

import lombok.Data;

@Data
public class OperationResponse {
    private String brand;
    private double rate;

    public OperationResponse() {
    }
    public OperationResponse(String brand, double rate) {
        this.brand = brand;
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
