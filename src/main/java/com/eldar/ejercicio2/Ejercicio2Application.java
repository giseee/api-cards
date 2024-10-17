package com.eldar.ejercicio2;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(info = @Info(title = "Ejercicio 2", version = "1.0", description = "Operaciones con tarjetas de crédito"))
@SpringBootApplication
public class Ejercicio2Application {

    public static void main(String[] args) {
        SpringApplication.run(Ejercicio2Application.class, args);
    }

}
