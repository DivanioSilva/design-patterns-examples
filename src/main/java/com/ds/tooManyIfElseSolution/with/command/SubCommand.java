package com.ds.tooManyIfElseSolution.with.command;

import java.math.BigDecimal;

public class SubCommand extends Values implements Command{

    public SubCommand(BigDecimal a, BigDecimal b) {
        super(a, b);
    }

    @Override
    public BigDecimal execute() {
        return a.subtract(b);
    }
}
