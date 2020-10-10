package com.ds.tooManyIfElseSolution.with.command;

import java.math.BigDecimal;

public class AddCommand extends Values implements Command {

    public AddCommand(BigDecimal a, BigDecimal b) {
        super(a, b);
    }

    @Override
    public BigDecimal execute() {
        return a.add(b);
    }
}
