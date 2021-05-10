package com.ds.designpattern.chainOfResponsability.coffee;

import com.ds.designpattern.builders.myOwnBuilder.Person;

public class FTPChain implements LogicalChain {
    private LogicalChain chain;
    private Person person = new Person.PersonBuilder("Divanio").build();

    @Override
    public void setNextChain(LogicalChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void setLogic(Person person) {
        if (this.person.equals(person)) {
            System.out.println("A pessoa existe na FTP");
        } else {
            System.out.println("A salvar a pessoa na FTP");
        }
        //this.chain.setLogic(person);
    }
}
