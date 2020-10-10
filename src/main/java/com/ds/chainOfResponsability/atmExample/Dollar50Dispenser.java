package com.ds.chainOfResponsability.atmExample;

import org.springframework.stereotype.Component;

@Component
public class Dollar50Dispenser extends AbstractDispenser {

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 50) {
            int num = currency.getAmount() / 50;
            int remainder = currency.getAmount() % 50;
            System.out.println("Dispensing " + num + " 50$ note");
            if (remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            } else {
                this.chain.dispense(currency);
            }
        }
    }
}
