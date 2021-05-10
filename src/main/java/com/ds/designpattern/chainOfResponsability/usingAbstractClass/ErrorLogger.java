package com.ds.designpattern.chainOfResponsability.usingAbstractClass;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int logLevel) {
        super(logLevel);
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
