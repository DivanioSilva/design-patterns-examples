package com.ds.designpatternsexamples.chainOfResponsability.atmExample;

public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);

    void dispense(Currency currency);
}
