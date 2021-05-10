package com.ds.designpattern.builders.complexObject;

public class Pepsi extends AbstractColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
