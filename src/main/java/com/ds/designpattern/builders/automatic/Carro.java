package com.ds.designpattern.builders.automatic;

import java.util.List;

public class Carro {
    private List<Roda> rodas;
    private List<Porta> portas;
    private String matricula;
    private String cor;

    public Carro() {
    }

    private Carro(String matricula) {
        this.matricula = matricula;
    }

    public Carro(String matricula, String cor) {
        this.matricula = matricula;
        this.cor = cor;
    }

    public static Carro createCarro(String matricula) {
        return new Carro(matricula);
    }

    public List<Roda> getRodas() {
        return rodas;
    }

    public void setRodas(List<Roda> rodas) {
        this.rodas = rodas;
    }

    public List<Porta> getPortas() {
        return portas;
    }

    public void setPortas(List<Porta> portas) {
        this.portas = portas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
