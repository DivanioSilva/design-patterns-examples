package com.ds.designpatternsexamples.objects.familyObject;

public enum PersonType {
    FILHO("filho"), PAI("pai"), MAE("mãe");

    public final String value;

    PersonType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
