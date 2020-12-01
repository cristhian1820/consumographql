package com.consume.graphql.consume.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.sql.Date;

@Data
public class InputPersonaje {

    private int id;
    private String nombre;
    private String apodo;
    private String ocupacion;
    private String fecha;
    private int serieId;

    public String inputQuery() {

        String input = String.format("Personaje:{nombre: \"%s\", apodo: \"%s\", ocupacion: \"%s\",fecha:\"%s\"}, serie: %s", nombre, apodo, ocupacion, fecha,serieId);
        System.out.println(input);
        return input;
    }
}
