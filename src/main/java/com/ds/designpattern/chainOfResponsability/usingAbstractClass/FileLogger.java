package com.ds.designpattern.chainOfResponsability.usingAbstractClass;

public class FileLogger extends AbstractLogger {

    public FileLogger(int logLevel) {
        super(logLevel);
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
