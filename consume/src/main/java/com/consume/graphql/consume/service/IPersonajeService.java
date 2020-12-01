package com.consume.graphql.consume.service;

import com.consume.graphql.consume.model.dto.personaje.InputPersonaje;
import org.springframework.http.ResponseEntity;

public interface IPersonajeService {

    ResponseEntity<String> obtenerPersonaje();

    ResponseEntity <String> registrar(InputPersonaje input);

}
