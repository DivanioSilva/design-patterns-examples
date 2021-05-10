package com.ds.designpattern.builders.complexObject;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float coast = 0.0f;
        for (Item i : items) {
            coast += i.price();
        }
        return coast;
    }

    public void showAllItens() {
        items.stream().forEach(item -> {
            System.out.print("Item: " + item.name());
            System.out.print(", Packing: " + item.packing().pack());
            System.out.println(", Price: " + item.price());
        });
    }
}
