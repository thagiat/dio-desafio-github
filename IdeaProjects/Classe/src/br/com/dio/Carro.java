package br.com.dio;

public class Carro {
    String cor, modelo;
    int capacidadeTanque;

    Carro(){

    }

    Carro(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double calculoEncherTanque(double valorGasolina){
        return valorGasolina*capacidadeTanque;
    }
}
