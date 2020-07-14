package com.ds.designpatternsexamples.chainOfResponsability.atmExample;

public abstract class AbstractDispenser implements DispenseChain{
    protected DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

}
