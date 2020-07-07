package com.ds.designpatternsexamples.factories.abstractFactory.withInterfaces;

public abstract class AbstractAnimal {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
