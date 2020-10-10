package com.ds.chainOfResponsability.usingAbstractClass;

public class Logger {

    public static AbstractLogger getChainOfLogger() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.nextLevel(fileLogger);
        fileLogger.nextLevel(consoleLogger);
        return errorLogger;
    }
}
