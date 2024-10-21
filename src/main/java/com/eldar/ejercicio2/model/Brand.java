package com.eldar.ejercicio2.model;

import com.eldar.ejercicio2.exceptions.InvalidOperationException;
import com.eldar.ejercicio2.model.strategy.Amex;
import com.eldar.ejercicio2.model.strategy.CalculateRate;
import com.eldar.ejercicio2.model.strategy.Nara;
import com.eldar.ejercicio2.model.strategy.Visa;

import java.time.LocalDate;

public class Brand {

    private String name;
    private CalculateRate calculateRate;

    public Brand(String name) {
        this.name = name;
        strategySelected(name);
    }

    private void strategySelected(String name) {
            switch (name) {
                case "Visa" -> this.calculateRate = new Visa();
                case "Amex" -> this.calculateRate = new Amex();
                case "Nara" -> this.calculateRate = new Nara();
                default -> throw new IllegalArgumentException("La marca no es válida: " + name);
            }
    }
    //es un template method

    public double calculateRateWithValidation(){
        double rate = calculateRate.calculateRate(LocalDate.now());
        rate = this.validateRate(rate);
        return rate;
    }

    private double validateRate(double rate) {
        return Math.min(Math.max(rate, 0.3), 5);
    }

    public String getName() {
        return name;
    }
    public CalculateRate getCalculateRate() {
        return calculateRate;
    }


}