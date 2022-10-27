package com.ds.designpattern.mediator;

public enum DevicesMessages {
    ACC_ON("Switched ON air conditioner"),
    AC_OFF("Switched OFF air conditioner"),
    FAN_ON("Switched ON fan"),
    FAN_OFF("Switched OFF fan"),
    TV_ON("Switched ON TV"),
    TV_OFF("Switched OFF TV");

    private final String value;

    DevicesMessages(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
