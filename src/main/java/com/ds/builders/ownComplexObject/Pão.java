package com.ds.designpatternsexamples.builders.ownComplexObject;

public class Pão extends AbstractProduct implements Item{
    private int qtd;

    public Pão(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public String name() {
        return "Pão";
    }

    @Override
    public int setQtd(int qtd) {
        return this.qtd;
    }

    @Override
    public int getQtd() {
        return this.qtd;
    }


    @Override
    public float unitPrice() {
        return 1f;
    }

    @Override
    public float price() {
        return this.qtd + this.unitPrice();
    }
}
