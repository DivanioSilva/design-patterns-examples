package com.ds.pluralSight.factory;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WebServiceDefinitionSearch implements DefinitionSearch {
    //https://api.dictionaryapi.dev/api/v1/entries/es/casa
    private static final String URI = "https://api.dictionaryapi.dev/api/v1/entries/en/";
    private final RestTemplate restTemplate;

    public WebServiceDefinitionSearch(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @Override
    public Definitions getDefinition(String word) {
        final String finalUri = URI + word;
        ResponseEntity<Object> objectResponseEntity = this.restTemplate.getForEntity(finalUri, Object.class);
        ResponseEntity<ResponseClass> test = this.restTemplate.exchange(finalUri, HttpMethod.GET, null, ResponseClass.class);
        ResponseEntity<Definitions> responseEntity = this.restTemplate.getForEntity(finalUri, Definitions.class);
        return responseEntity.getBody();
    }

    public static class ResponseClass {
        private Definition[] definitions;

        public ResponseClass(Definition[] definitions) {
            this.definitions = definitions;
        }

        public Definition[] getDefinitions() {
            return definitions;
        }

        public void setDefinitions(Definition[] definitions) {
            this.definitions = definitions;
        }
    }
}
