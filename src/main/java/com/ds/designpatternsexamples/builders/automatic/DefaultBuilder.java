package com.ds.designpatternsexamples.builders.automatic;

public class DefaultBuilder {
    private String lado;
    private boolean frente;
    private int size;

    public DefaultBuilder setLado(String lado) {
        this.lado = lado;
        return this;
    }

    public DefaultBuilder setFrente(boolean frente) {
        this.frente = frente;
        return this;
    }

    public Porta createPorta() {
        return new Porta(lado, frente);
    }

    public DefaultBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public Roda createRoda() {
        return new Roda(size);
    }
}
