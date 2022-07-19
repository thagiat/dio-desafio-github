package br.dio.com.sobrecarga;

public class Sobrecarga {
    public static void main(String[] args) {

    }

    public int calculoArea(int a, int b){
        return a*b;
    }

    public double calculoArea(double a, double b){
        return a*b;
    }

    public int calculoArea(int a, int b, int c, int d){
        return (a+b)/2*c;
    }
}
