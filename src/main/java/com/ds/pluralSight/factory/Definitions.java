package com.ds.pluralSight.factory;

import java.util.List;

public class Definitions {
    private List<Definition> definitions;

    public Definitions(List<Definition> definitions) {
        this.definitions = definitions;
    }

    public List<Definition> getDefinitions() {
        return definitions;
    }

    public void setDefinitions(List<Definition> definitions) {
        this.definitions = definitions;
    }
}
