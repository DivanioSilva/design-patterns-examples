package com.ds.designpattern.chainOfResponsability.atmExample;

import org.springframework.stereotype.Component;

@Component
public class Dollar20Dispenser extends AbstractDispenser {

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 20) {
            int num = currency.getAmount() / 20;
            int remainder = currency.getAmount() % 20;
            System.out.println("Dispensing " + num + " 20$ note");
            if (remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            } else {
                this.chain.dispense(currency);
            }
        }
    }
}
