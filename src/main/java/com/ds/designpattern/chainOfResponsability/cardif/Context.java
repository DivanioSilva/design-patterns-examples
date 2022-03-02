package com.ds.designpattern.chainOfResponsability.cardif;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private Map<String, Object> finalMap;

    public Context() {
        this.finalMap = new HashMap<>();
    }

    public Object get(BoxFieldType fieldType) {
        return this.finalMap.get(fieldType.getValue());
    }

    public void add(BoxFieldType fieldType, Object value) {
        this.finalMap.put(fieldType.getValue(), value);
    }
}
