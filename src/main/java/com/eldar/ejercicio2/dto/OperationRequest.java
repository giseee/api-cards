package com.eldar.ejercicio2.dto;

import com.eldar.ejercicio2.model.Card;
import lombok.Data;

@Data
public class OperationRequest {
    private double amount;
    private Card card;
    public OperationRequest() {
    }

    public OperationRequest(double amount, Card card) {
            this.amount = amount;
            this.card = card;
    }
}
