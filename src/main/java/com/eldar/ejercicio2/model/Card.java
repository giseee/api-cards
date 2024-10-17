package com.eldar.ejercicio2.model;

import java.time.LocalDate;

/**
 * Clase que representa una tarjeta de credito
 */
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
    public double calculateTotalRate(double amount)
    {
        if (amount < 0) {
            throw new IllegalArgumentException("El monto no puede ser negativo");
        }
        return amount * (1 + brand.getCalculateRate().calculateRate(LocalDate.now()) / 100);
    }

    //getters

    public String getNumber() {
        return number;
    }
    public String getCardholder() {
        return cardholder;
    }
    public void setCardholder(String cardholder) {
        this.cardholder = cardholder;
    }
    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
    public LocalDate getExpirationDate() {
        return expirationDate;
    }
}
