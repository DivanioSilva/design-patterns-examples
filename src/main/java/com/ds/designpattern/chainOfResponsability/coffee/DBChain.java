package com.ds.designpattern.chainOfResponsability.coffee;

import com.ds.designpattern.builders.myOwnBuilder.Person;

public class DBChain implements LogicalChain {
    private LogicalChain chain;
    private Person dbPerson = new Person.PersonBuilder("Divanio").build();

    @Override
    public void setNextChain(LogicalChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void setLogic(Person person) {
        if (dbPerson.equals(person)) {
            System.out.println("A pessoa existe na DB");
        } else {
            System.out.println("A salvar a pessoa na DB");
        }
        this.chain.setLogic(person);
    }
}
