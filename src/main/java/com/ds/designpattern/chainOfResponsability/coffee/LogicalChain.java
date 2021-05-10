package com.ds.designpattern.chainOfResponsability.coffee;

import com.ds.designpattern.builders.myOwnBuilder.Person;

public interface LogicalChain {
    void setNextChain(LogicalChain nextChain);

    void setLogic(Person person);
}
