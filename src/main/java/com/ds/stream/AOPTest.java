package com.ds.stream;

import com.ds.designpattern.builders.myOwnBuilder.Person;

public class AOPTest {
    private String message;
    private Person person;

    public AOPTest(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return person.toString();
    }
}
