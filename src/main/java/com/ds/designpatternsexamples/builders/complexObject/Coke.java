package com.ds.designpatternsexamples.builders.complexObject;

public class Coke extends AbstractColdDrink{
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
