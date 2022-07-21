package br.dio.com.sobrecarga;

public class Quadrilatero {

    //Quadrado
    public void calculoArea(double a){
        System.out.println("Area do Quadrado: " + a*a);
    }

    //Retangulo
    public void calculoArea(double a, double b){
        System.out.println("Area do Retangulo: " + a*b) ;
    }

    //Trapezio
    public void calculoArea(double baseMaior, double baseMenor, double altura){
        System.out.println( "Area do Trapezio: " + ((baseMaior+baseMenor)*altura)/2);
    }

    //Losango
    public void calculoArea(float diagonal1, float diagonal2){
        System.out.println( "Area do Losango: " + (diagonal1*diagonal2)/2);
    }
}
