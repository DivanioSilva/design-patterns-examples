package com.ds.designpatternsexamples.chainOfResponsability;

public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);

    void dispense(Currency currency);
}
