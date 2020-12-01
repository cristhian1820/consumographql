package com.consume.graphql.consume.controller;

import com.consume.graphql.consume.service.ISerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serie")
public class SerieController {

    private final ISerieService iSerieService;

    @Autowired
    public SerieController(ISerieService iSerieService) {
        this.iSerieService = iSerieService;
    }

    @GetMapping
    public ResponseEntity<String> consulSeries(){
        return iSerieService.consultSeries();
    }

}
