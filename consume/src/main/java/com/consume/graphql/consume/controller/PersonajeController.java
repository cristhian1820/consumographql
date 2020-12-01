package com.consume.graphql.consume.controller;

import com.consume.graphql.consume.model.dto.personaje.InputPersonaje;
import com.consume.graphql.consume.service.IPersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/personaje")
public class PersonajeController {

    private final IPersonajeService iPersonajeService;

    @Autowired
    public PersonajeController(IPersonajeService iPersonajeService) {
        this.iPersonajeService = iPersonajeService;
    }

    @GetMapping(value = "/consul")
    public ResponseEntity<String> consul() {
        return iPersonajeService.obtenerPersonaje();
    }

    @PostMapping(value = "/registrar")
    public ResponseEntity<String> registrar(@RequestBody InputPersonaje input) {
        return iPersonajeService.registrar(input);
    }

}
