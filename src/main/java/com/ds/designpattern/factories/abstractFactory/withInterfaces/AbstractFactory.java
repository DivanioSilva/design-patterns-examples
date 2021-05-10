package com.ds.designpattern.factories.abstractFactory.withInterfaces;

public interface AbstractFactory<T> {
    T create(String objectToBeCreated);
}
