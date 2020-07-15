package com.ds.chainOfResponsability.atmExample;

import org.springframework.stereotype.Component;

@Component
public class Dollar10Dispenser extends AbstractDispenser{

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount()>=10){
            int num = currency.getAmount() / 10;
            int remainder = currency.getAmount() % 10;
            System.out.println("Dispensing "+num+ " 10$ note");
            if(remainder != 0){
                this.chain.dispense(new Currency(remainder));
            }else{
                this.chain.dispense(currency);
            }
        }
    }
}
