package com.ds.factories.abstractFactory.withInterfaces;

public class ShapeFactory implements AbstractFactory<Shape>{

    @Override
    public Shape create(String objectToBeCreated) {
        if("Triangle".equalsIgnoreCase(objectToBeCreated)){
            return new Triangule();
        }else if("Square".equalsIgnoreCase(objectToBeCreated)){
            return new Square();
        }
        return null;
    }
}
