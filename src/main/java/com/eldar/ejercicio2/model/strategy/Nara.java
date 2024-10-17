package com.eldar.ejercicio2.model.strategy;

import java.time.LocalDate;

public class Nara implements CalculateRate {
    @Override
    public double calculateRate(LocalDate date) {
        return date.getDayOfMonth() * 0.5;
    }

}
