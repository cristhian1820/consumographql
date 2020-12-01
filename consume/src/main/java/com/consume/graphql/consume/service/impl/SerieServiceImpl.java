package com.consume.graphql.consume.service.impl;

import com.consume.graphql.consume.model.dto.serie.InputSerie;
import com.consume.graphql.consume.service.ISerieService;
import com.consume.graphql.consume.utils.RequestGraphql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class SerieServiceImpl implements ISerieService {

    private final RequestGraphql requestGraphql;

    @Autowired
    public SerieServiceImpl(RequestGraphql requestGraphql) {
        this.requestGraphql = requestGraphql;
    }

    @Override
    public ResponseEntity<String> consultSeries() {
        return null;
    }

    @Override
    public ResponseEntity<String> registerSeries(InputSerie inputSerie) {
        String query = String.format("mutation{\n" +
                "  registrarSeries(%s){\n" +
                "    id\n" +
                "    nombre\n" +
                "    estaciones\n" +
                "  }\n" +
                "  \n" +
                "}\n",inputSerie.inputQuery());
        System.out.println(query);
        return requestGraphql.send(query);
    }
}
