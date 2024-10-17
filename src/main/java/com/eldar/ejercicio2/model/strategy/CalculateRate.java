package com.eldar.ejercicio2.model.strategy;

import java.time.LocalDate;

public interface CalculateRate {
    double calculateRate(LocalDate date);
}
