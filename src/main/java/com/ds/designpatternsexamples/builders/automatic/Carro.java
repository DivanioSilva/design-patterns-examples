package com.ds.designpatternsexamples.builders.automatic;

import java.util.List;

public class Carro {
    private List<Roda> rodas;
    private List<Porta> portas;
    private String matricula;
    private String cor;

    public Carro() {
    }

    private Carro(String matricula, String cor) {
        this.matricula = matricula;
        this.cor = cor;
    }

    public Carro(List<Roda> rodas, List<Porta> portas, String matricula, String cor) {
        this.rodas = rodas;
        this.portas = portas;
        this.matricula = matricula;
        this.cor = cor;
    }

    public static Carro createCarro(String matricula, String cor) {
        return new Carro(matricula, cor);
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
