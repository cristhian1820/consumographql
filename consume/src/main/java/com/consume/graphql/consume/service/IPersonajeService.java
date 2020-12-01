package com.consume.graphql.consume.service;

import com.consume.graphql.consume.model.dto.InputPersonaje;
import com.consume.graphql.consume.model.dto.PersonajeDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IPersonajeService {

    ResponseEntity<String> obtenerPersonaje();

    ResponseEntity <String> registrar(InputPersonaje input);

}
