package com.ds.designpattern.mediator;

public enum DevicesMessages {
    ACC_ON("Switched on air conditioner"),
    AC_OFF("Switched off air conditioner"),
    FAN_ON("Switched on fan"),
    FAN_OFF("Switched OFF fan");

    private final String value;

    DevicesMessages(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
