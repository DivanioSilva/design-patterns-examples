package com.ds.chainOfResponsability.atmExample;

import org.springframework.stereotype.Component;

@Component
public class ATMDispenserChain {
    private DispenserChain dispenserChain;

    public ATMDispenserChain() {
        dispenserChain = new Dollar50Dispenser();
        DispenserChain c2 = new Dollar20Dispenser();
        DispenserChain c3 = new Dollar10Dispenser();
        dispenserChain.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public DispenserChain getDispenserChain() {
        return dispenserChain;
    }
}
