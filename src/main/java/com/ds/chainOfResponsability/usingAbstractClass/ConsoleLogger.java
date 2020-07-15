package com.ds.chainOfResponsability.usingAbstractClass;

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int logLevel) {
        super(logLevel);
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
