package com.ds.designpattern.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Dictionary {

    @Autowired
    private final DefinitionSearch search;

    public Dictionary(DefinitionSearch search) {
        this.search = search;
    }

    public Definitions getDefinitions(String word) {
        return search.getDefinition(word);
    }
}
