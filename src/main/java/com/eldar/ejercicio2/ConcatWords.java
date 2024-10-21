package com.eldar.ejercicio2;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;
public class ConcatWords {
    public static String concatWords(String[] palabras) {
        if (palabras.length > 10) {
            throw new IllegalArgumentException("El arreglo debe tener 10 palabras");
        }
        return Arrays.stream(palabras)
                .filter(Objects::nonNull)
                .filter(palabra -> palabra.matches("^[a-zA-Z ]+$"))//tambien me comi esta restriccion, aca lo puse de filtro pero puede ir de condicion
                .map(String::toLowerCase).
                collect(Collectors.joining(" "));
    }


    public static void main(String[] args) {
    try {
        //Arreglo el error en mi enunciado decia que eran 10 palabras y mi array es fijo de 3
        String[] palabras = {"FirstWord", "SecondWord", "THIRDW4RD","FirstWord", "SecondWord", "THIRDW4RD","FirstWord", "SecondWord", "THIRDW4RD","FirstWord", "SecondWord", "THIRDW4RD","FirstWord", "SecondWord", "THIRDW4RD"};
        System.out.println(concatWords(palabras));
        String [] palabras2 = {"FirstWo34rd"};
    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
    }
}