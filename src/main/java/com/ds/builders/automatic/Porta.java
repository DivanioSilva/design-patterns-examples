package com.ds.designpatternsexamples.builders.automatic;

public class Porta {
    private String lado;
    private boolean frente;

    public Porta(String lado, boolean frente) {
        this.lado = lado;
        this.frente = frente;
    }

    public String getLado() {
        return lado;
    }

    public void setLado(String lado) {
        this.lado = lado;
    }

    public boolean isFrente() {
        return frente;
    }

    public void setFrente(boolean frente) {
        this.frente = frente;
    }
}
