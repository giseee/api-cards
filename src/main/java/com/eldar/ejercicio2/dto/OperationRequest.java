package com.eldar.ejercicio2.dto;

import com.eldar.ejercicio2.model.Card;


public class OperationRequest {
    private double amount;
    private Card card;
    public OperationRequest() {
    }

    public OperationRequest(double amount, Card card) {
            this.amount = amount;
            this.card = card;
    }

    public double getAmount() {
            return amount;
    }

    public Card getCard() {
            return card;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
