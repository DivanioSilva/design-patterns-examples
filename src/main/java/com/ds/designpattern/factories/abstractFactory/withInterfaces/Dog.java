package com.ds.designpattern.factories.abstractFactory.withInterfaces;

public class Dog extends AbstractAnimal implements Animal {

    @Override
    public String getAnimal() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Au au";
    }

    @Override
    public void addName(String name) {
        this.name = name;
    }

    @Override
    public String animalName() {
        return name;
    }


}
