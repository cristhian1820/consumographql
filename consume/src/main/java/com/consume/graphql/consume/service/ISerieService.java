package com.consume.graphql.consume.service;

import com.consume.graphql.consume.model.dto.serie.InputSerie;
import org.springframework.http.ResponseEntity;

public interface ISerieService {

    ResponseEntity<String> consultSeries();

    ResponseEntity<String> registerSeries(InputSerie inputSerie);
}
