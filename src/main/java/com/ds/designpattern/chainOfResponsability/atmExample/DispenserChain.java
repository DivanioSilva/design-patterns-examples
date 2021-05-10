package com.ds.designpattern.chainOfResponsability.atmExample;

public interface DispenserChain {
    void setNextChain(DispenserChain nextChain);

    void dispense(Currency currency);
}
