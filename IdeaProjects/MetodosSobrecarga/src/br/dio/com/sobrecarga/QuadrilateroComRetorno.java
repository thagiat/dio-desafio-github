package br.dio.com.sobrecarga;

public class QuadrilateroComRetorno {

    //Quadrado
    public double calculoArea(double a){
        return a*a;
    }

    //Retangulo
    public double calculoArea(double a, double b){
        return a*b;
    }

    //Trapezio
    public double calculoArea(double baseMaior, double baseMenor, double altura){
        return ((baseMaior+baseMenor)*altura)/2;
    }

    //Losango
    public double calculoArea(float diagonal1, float diagonal2){
        return (diagonal1*diagonal2)/2;
    }
}
