package com.consume.graphql.consume.service.impl;

import com.consume.graphql.consume.model.dto.InputPersonaje;
import com.consume.graphql.consume.utils.RequestMutation;
import com.consume.graphql.consume.utils.RequestQuery;
import com.consume.graphql.consume.service.IPersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PersonajeServiceImpl implements IPersonajeService {

    private final RequestQuery peticionQuery;
    private final RequestMutation peticionMutation;

    @Autowired
    public PersonajeServiceImpl(RequestQuery peticionQuery, RequestMutation requestMutation) {
        this.peticionQuery = peticionQuery;
        this.peticionMutation = requestMutation;
    }

    @Override
    public ResponseEntity<String> obtenerPersonaje() {

        String query = "{\n" +
                "  allPersonajes{\n" +
                "    id\n" +
                "    nombre\n" +
                "    apodo\n" +
                "    ocupacion\n" +
                "    fecha\n" +
                "    series{\n" +
                "      id\n" +
                "      nombre\n" +
                "    }\n" +
                "  }\n" +
                "}";

        return peticionQuery.sendRequest(query);
    }

    @Override
    public ResponseEntity<String> registrar(InputPersonaje input) {
        String query = String.format("mutation{\n" +
                "  registrarPersonaje(%s){    \n" +
                "    id\n" +
                "    nombre\n" +
                "    apodo\n" +
                "    ocupacion\n" +
                "    fecha\n" +
                "  }\n" +
                "}\n",input.inputQuery());
        System.out.println(query);
        return peticionMutation.sendMutation(query);
    }
}
