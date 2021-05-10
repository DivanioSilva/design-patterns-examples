package com.ds.designpattern.builders.automatic;

import java.util.List;

public class CarroBuilder {
    private String matricula;
    private String cor;
    private List<Roda> rodas;
    private List<Porta> portas;

    public CarroBuilder(String matricula) {
        this.matricula = matricula;
    }

    public CarroBuilder cor(String cor) {
        this.cor = cor;
        return this;
    }

    public CarroBuilder rodas(List<Roda> rodas) {
        this.rodas = rodas;
        return this;
    }

    public CarroBuilder portas(List<Porta> portas) {
        this.portas = portas;
        return this;
    }

    public Carro build() {
        return new Carro(matricula, cor);
    }
}