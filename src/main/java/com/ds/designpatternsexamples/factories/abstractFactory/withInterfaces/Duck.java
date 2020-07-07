package com.ds.designpatternsexamples.factories.abstractFactory.withInterfaces;

public class Duck extends AbstractAnimal implements Animal{

    @Override
    public String getAnimal() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "Squeks";
    }

    @Override
    public void addName(String name) {
        this.name = name;
    }

    @Override
    public String animalName() {
        return this.name;
    }
}
