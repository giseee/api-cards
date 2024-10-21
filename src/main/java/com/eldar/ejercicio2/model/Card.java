package com.eldar.ejercicio2.model;

import com.eldar.ejercicio2.exceptions.InvalidOperationException;
import lombok.Getter;

import java.time.LocalDate;

/**
 * Clase que representa una tarjeta de credito
 */
@Getter
public class Card {
    private String number;
    private String cardholder;
    private Brand brand;
    private LocalDate expirationDate;

    public Card(String number, String cardholder, LocalDate expirationDate, String brand) {
        this.number = number;
        this.cardholder = cardholder;
        this.brand = new Brand(brand);
        this.expirationDate = expirationDate;
    }

    //metodos super necesarios para el ejercicio

    public boolean isValid(){
        return LocalDate.now().isBefore(expirationDate);
    }
    public double getRateCard() {
            return brand.calculateRateWithValidation();

    }

    @Override
    public String toString() {
        return "Tarjeta: " +
                " número= " + number +
                ",nombre y apellido= " + cardholder + '\'' +
                ", fecha de vencimiento= " + expirationDate +
                ", marca=" + brand.getName();
    }

    public String cardIsEqualTo(Card card){
        if (this.number.equals(card.number) && this.cardholder.equals(card.cardholder)
                && this.expirationDate.equals(card.expirationDate) && this.brand.equals(card.brand)){
            return "Las tarjetas son iguales";
        }
        return "Las tarjetas son diferentes";

    }


}
