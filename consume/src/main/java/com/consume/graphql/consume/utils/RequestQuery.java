package com.consume.graphql.consume.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class RequestQuery {
    RestTemplate restTemplate = new RestTemplate();

    @Value("${url.graphql.server.ip}")
    String URL;

    public ResponseEntity<String> sendRequest(String query) {

        HttpHeaders headers = new HttpHeaders();
        headers.add("content-type", "application/graphql");
        return restTemplate.postForEntity(URL, new HttpEntity<>(query, headers), String.class);

    }
}
