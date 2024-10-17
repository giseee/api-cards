package com.eldar.ejercicio2.model.strategy;

import java.time.LocalDate;

public class Amex implements CalculateRate {
    @Override
    public double calculateRate(LocalDate date) {
        return date.getMonthValue() * 0.1;
    }

}
