package com.ds.designpatternsexamples.exceptions;

public class DBException {

    public static final class BadExecution extends BaseException{
        public BadExecution() {
            super(DBExceptionsMessages.BAD_EXECUTION.getValue());
        }
    }

    public static final class NoData extends BaseException{
        public NoData() {
            super(DBExceptionsMessages.NO_DATA.getValue());
        }
    }

    public static final class MoreData extends BaseException{
        public MoreData() {
            super(DBExceptionsMessages.MORE_DATA.getValue());
        }
    }

    public static final class InvalidParam extends BaseException{
        public InvalidParam() {
            super(DBExceptionsMessages.INVALID_PARAM.getValue());
        }
    }
}
