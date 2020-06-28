package com.ds.designpatternsexamples.factories.abstractFactory.withInterfaces;

public interface AbstractFactory<T> {
    T create(String objectToBeCreated);
}
