package com.eldar.ejercicio2.model.strategy;

import java.time.LocalDate;

public class Visa implements CalculateRate {
    @Override
    public double calculateRate(LocalDate date) {
        int digitAnio = date.getYear() % 100;
        return (double)  digitAnio/date.getMonthValue();
    }
}
