package com.ds.factories.abstractFactory.withInterfaces;

public interface AbstractFactory<T> {
    T create(String objectToBeCreated);
}
