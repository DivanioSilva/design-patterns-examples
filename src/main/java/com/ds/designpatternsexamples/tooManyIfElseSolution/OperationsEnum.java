package com.ds.designpatternsexamples.tooManyIfElseSolution;

public enum OperationsEnum {
    ADICAO("+"),
    SUBTRACAO("-"),
    DIVISAO("/"),
    MULTIPLICACAO("*");

    private final String value;

    OperationsEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
