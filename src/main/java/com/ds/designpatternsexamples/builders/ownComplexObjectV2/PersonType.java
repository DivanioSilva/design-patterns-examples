package com.ds.designpatternsexamples.builders.ownComplexObjectV2;

public enum PersonType {
    FILHO("filho"), PAI("pai"), MAE("mãe");

    public final String value;

    PersonType(String value) {
        this.value = value;
    }
}
