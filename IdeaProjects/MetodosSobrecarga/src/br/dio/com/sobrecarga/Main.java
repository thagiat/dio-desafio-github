package br.dio.com.sobrecarga;

public class Main {
    public static void main(String[] args) {
        Quadrilatero quad = new Quadrilatero();
        quad.calculoArea(16.5);
        quad.calculoArea(10d,15d);
        quad.calculoArea(10,12,2);
        quad.calculoArea(10f,15f);

        QuadrilateroComRetorno quadComRetorno = new QuadrilateroComRetorno();
        System.out.println("Area do Quadrado: " + quadComRetorno.calculoArea(15));
        System.out.println("Area do Retangulo: " + quadComRetorno.calculoArea(10d,5d)) ;
        System.out.println( "Area do Trapezio: " + quadComRetorno.calculoArea(15,10,5));
        System.out.println( "Area do Losango: " + quadComRetorno.calculoArea(10d,5d));
    }
}
