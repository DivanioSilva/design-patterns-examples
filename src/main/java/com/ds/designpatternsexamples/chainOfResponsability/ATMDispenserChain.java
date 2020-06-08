package com.ds.designpatternsexamples.chainOfResponsability;

import org.springframework.stereotype.Component;

@Component
public class ATMDispenserChain {
    private DispenseChain dispenserChain;

    public ATMDispenserChain() {
        dispenserChain = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();
        dispenserChain.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public DispenseChain getDispenserChain() {
        return dispenserChain;
    }
}
