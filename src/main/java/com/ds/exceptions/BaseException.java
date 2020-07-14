package com.ds.exceptions;

public abstract class BaseException extends Exception{
    //Each exception message will be held here
    private String message;

    public BaseException(String message) {
        this.message = message;
    }

    //Message can be retrieved using this accessor method
    @Override
    public String getMessage() {
        return message;
    }
}
