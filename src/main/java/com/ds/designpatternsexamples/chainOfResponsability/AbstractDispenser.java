package com.ds.designpatternsexamples.chainOfResponsability;

public abstract class AbstractDispenser implements DispenseChain{
    protected DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

}
