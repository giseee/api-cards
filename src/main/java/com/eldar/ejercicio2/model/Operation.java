package com.eldar.ejercicio2.model;


import com.eldar.ejercicio2.exceptions.InvalidOperationException;

public class Operation {
    private double amount;
    private Card card;

    public Operation(double amount, Card card) throws InvalidOperationException {
        if(!card.isValid() || !isValid(amount)) {
            throw new InvalidOperationException("Tarjeta vencida o el monto no es valido, no puede realizar la operación");
        }
        this.amount = amount;
        this.card = card;
    }
    public boolean isValid(double amount) {
        return (amount > 0 && amount < 1000);
    }

    @Override
    public String toString() {
        return "nombre: " + this.card.getBrand().getName() + " importe: " + this.amount;
    }

    public double calculateTotalRate()
    {
        return card.calculateTotalRate(this.amount);
    }

    public Card getCard() {
        return card;
    }

    public double getAmount() {
        return amount;
    }
}
