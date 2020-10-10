package com.ds.builders.complexObject;

public class ChickenBurger extends AbstractBurger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
