package com.ada.carro_devas.model;

import java.util.Objects;

public class Carro {
    private String cor;
    private String marca;
    private int ano;
    private boolean ligado;
    private int velocidadeAtual;
    private int velocidadeMaxima;

    public Carro(){
        this.ligado = false;
        this.velocidadeAtual = 0;
        this.velocidadeMaxima = 100;
    }

    public Carro(String marca){
        this.marca = marca;
    }

    // Os testes mostram a presenca de erros e nao sua ausencia
    public Carro(String cor, String marca, int ano) {
        this.cor = cor;
        this.marca = marca;
        this.ano = ano;
        this.ligado = false;
        this.velocidadeAtual = 0;
        this.velocidadeMaxima = 100;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                ", ligado=" + ligado +
                ", velocidadeAtual=" + velocidadeAtual +
                ", velocidadeMaxima=" + velocidadeMaxima +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return marca.equals(carro.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca);
    }
}
