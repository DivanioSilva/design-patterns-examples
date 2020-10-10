package com.ds.builders.ownComplexObject;

import java.util.ArrayList;
import java.util.List;

public class Box {
    private List<Item> items = new ArrayList<>();

    private Box(BoxBuilder boxBuilder) {
        boxBuilder.items.forEach(a -> this.items.add(a));
    }

    public void print() {
        this.items.forEach(i -> {
            System.out.print(i.name() + " - " + i.getQtd() + " - " + i.price() + "\n");
        });
    }

    public static class BoxBuilder {
        private List<Item> items = new ArrayList<>();

        public BoxBuilder azeitonas(int qtd) {
            items.add(new Azeitonas(qtd));
            return this;
        }

        public BoxBuilder pao(int qtd) {
            items.add(new Pão(qtd));
            return this;
        }

        public Box build() {
            Box box = new Box(this);
            return box;
        }
    }
}
