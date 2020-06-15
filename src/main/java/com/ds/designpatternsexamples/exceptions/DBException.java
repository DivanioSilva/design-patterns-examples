package com.ds.designpatternsexamples.exceptions;

public class DBException {

    public static final class BadExecution extends BaseException{
        public BadExecution(String message) {
            super(message);
        }
    }

    public static final class NoData extends BaseException{
        public NoData(String message) {
            super(message);
        }
    }

    public static final class MoreData extends BaseException{
        public MoreData(String message) {
            super(message);
        }
    }

    public static final class InvalidParam extends BaseException{
        public InvalidParam(String message) {
            super(message);
        }
    }
}
