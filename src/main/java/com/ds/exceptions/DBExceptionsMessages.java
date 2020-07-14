package com.ds.exceptions;

public enum DBExceptionsMessages {
    BAD_EXECUTION("Bad execution exception message"),
    NO_DATA(" No data exception message"),
    MORE_DATA("More data exception message"),
    INVALID_PARAM("Invalid param exception message");

    private final String value;

    DBExceptionsMessages(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
