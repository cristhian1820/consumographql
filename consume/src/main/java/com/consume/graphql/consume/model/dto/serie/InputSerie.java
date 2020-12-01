package com.consume.graphql.consume.model.dto.serie;

import lombok.Data;

@Data
public class InputSerie {

    private int id;
    private String nombre;
    private String estacion;

    public String inputQuery() {
        String inputSerie = String.format("series:{nombre: \"%s\", estaciones: \"%s\"}", nombre,estacion);
        System.out.println(inputSerie);
        return inputSerie;

    }
}
