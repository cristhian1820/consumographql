package com.consume.graphql.consume.model.dto.personaje;

import lombok.Data;

@Data
public class PersonajeDto {

    private int id;
    private String nombre;
    private String apodo;
    private String ocupacion;
    private String fecha;
    private int serieId;


}
