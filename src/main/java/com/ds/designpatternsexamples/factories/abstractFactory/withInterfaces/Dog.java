package com.ds.designpatternsexamples.factories.abstractFactory.withInterfaces;

public class Dog implements Animal {
    @Override
    public String getAnimal() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Au au";
    }
}
