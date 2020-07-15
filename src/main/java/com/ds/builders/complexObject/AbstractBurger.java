package com.ds.builders.complexObject;

public abstract class AbstractBurger implements Item{
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
