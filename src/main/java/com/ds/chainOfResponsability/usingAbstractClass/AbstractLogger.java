package com.ds.chainOfResponsability.usingAbstractClass;

import java.util.Objects;

public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected AbstractLogger nextLogger;
    protected int logLevel;

    public AbstractLogger(int logLevel) {
        this.logLevel = logLevel;
    }

    public void nextLevel(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int logLevel, String message){
        if(this.logLevel == logLevel){
            System.out.println(message);
        }
        if(Objects.nonNull(nextLogger)){
            nextLogger.logMessage(logLevel, message);
        }
    }

    abstract protected void write(String message);
}
