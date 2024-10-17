package com.eldar.ejercicio2.controller;

import com.eldar.ejercicio2.dto.OperationRequest;
import com.eldar.ejercicio2.dto.OperationResponse;
import com.eldar.ejercicio2.exceptions.InvalidOperationException;
import com.eldar.ejercicio2.model.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")
public class OperationController {

    @GetMapping()
    public String hello() {
        return "Para ver la operación, por favor, haga una petición POST a /operation";
    }
    @PostMapping("/operation")
    public ResponseEntity<OperationResponse> operation( @RequestBody OperationRequest operationRequest) throws InvalidOperationException {
        Operation operation = new Operation(operationRequest.getAmount(), operationRequest.getCard());
        return ResponseEntity.ok(new OperationResponse(operation.getCard().getBrand().getName(), operation.calculateTotalRate()));
    }
}
