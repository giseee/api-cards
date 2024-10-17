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
        }
    }

    public double calculateRateWithValidation(LocalDate date) throws InvalidOperationException {
        if (date == null) {
            throw new IllegalArgumentException("La fecha no puede ser nula");
        }
        double rate = calculateRate.calculateRate(date);
        if (rate < 0.3 || rate > 5) {
            throw new InvalidOperationException("La tasa no es valida: " + rate);
        }
        return rate;
    }

    public String getName() {
        return name;
    }
    public CalculateRate getCalculateRate() {
        return calculateRate;
    }

}