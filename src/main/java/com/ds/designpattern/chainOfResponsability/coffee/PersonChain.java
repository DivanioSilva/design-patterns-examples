package com.ds.designpattern.chainOfResponsability.coffee;

public class PersonChain {
    private LogicalChain c1;

    public PersonChain() {
        this.c1 = new DBChain();
        LogicalChain c2 = new FTPChain();
        c1.setNextChain(c2);
    }

    public LogicalChain getC1() {
        return c1;
    }
}
