package com.ds.designpatternsexamples.builders.ownComplectObject;

public class Azeitonas extends AbstractProduct implements Item {

    private int qtd;

    public Azeitonas(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public String name() {
        return "Azeitonas";
    }

    @Override
    public int setQtd(int qtd) {
        return this.qtd = qtd;
    }

    @Override
    public float unitPrice() {
        return 1.5f;
    }

    @Override
    public float price() {
        return this.unitPrice() * this.getQtd();
    }

    @Override
    public int getQtd() {
        return this.qtd;
    }
}
