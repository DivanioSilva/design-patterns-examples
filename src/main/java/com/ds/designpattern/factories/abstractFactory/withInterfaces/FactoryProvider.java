package com.ds.designpattern.factories.abstractFactory.withInterfaces;

public class FactoryProvider {

    public static AbstractFactory getAbstractFactoryByType(String choice) {
        if ("Animal".equals(choice)) {
            return new AnimalFactory();
        } else if ("Shape".equals(choice)) {
            return new ShapeFactory();
        }
        return null;
    }

    public static AbstractFactory getAbstractFactoryByInterface(Class choice) {
        if (Animal.class.getName().equals(choice.getName())) {
            return new AnimalFactory();
        } else if (Shape.class.getName().equals(choice.getName())) {
            return new ShapeFactory();
        }
        return null;
    }
}
