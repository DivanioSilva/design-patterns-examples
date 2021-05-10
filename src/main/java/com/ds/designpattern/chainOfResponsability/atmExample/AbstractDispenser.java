package com.ds.designpattern.chainOfResponsability.atmExample;

public abstract class AbstractDispenser implements DispenserChain {
    protected DispenserChain chain;

    @Override
    public void setNextChain(DispenserChain nextChain) {
        this.chain = nextChain;
    }

}
