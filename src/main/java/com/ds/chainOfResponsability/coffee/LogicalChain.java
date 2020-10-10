package com.ds.chainOfResponsability.coffee;

import com.ds.builders.myOwnBuilder.Person;

public interface LogicalChain {
    void setNextChain(LogicalChain nextChain);

    void setLogic(Person person);
}
