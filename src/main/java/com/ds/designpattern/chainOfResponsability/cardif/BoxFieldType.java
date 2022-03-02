package com.ds.designpattern.chainOfResponsability.cardif;

public enum BoxFieldType {
    //STRING("string"),
    //LIST("list"),
    //INTEGER("integer"),
    TOKEN("token"),
    APP_DOMAIN_ID("appDomainId"),
    AREA_IDS("areaIds");

    private final String value;

    BoxFieldType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
