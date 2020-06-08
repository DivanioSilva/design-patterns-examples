package com.ds.designpatternsexamples.builders.complexObject;

public abstract class AbstractColdDrink implements Item{
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
