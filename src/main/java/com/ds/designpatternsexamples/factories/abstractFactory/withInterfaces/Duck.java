package com.ds.designpatternsexamples.factories.abstractFactory.withInterfaces;

public class Duck implements Animal{
    @Override
    public String getAnimal() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "Squeks";
    }
}
