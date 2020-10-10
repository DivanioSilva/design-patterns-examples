package com.ds.tooManyIfElseSolution.with.command;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

public class Calculator {

    public BigDecimal calculate(Command command) {
        return command.execute();
    }
}
