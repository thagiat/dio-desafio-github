package br.com.dio.metodos;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Calculadora {


    public static void somar(double a, double b){
        double resultado = a + b;
        System.out.println("A soma de "+ a + " e " + b +" resulta em " + resultado);
    }
    public static void subtrair(double a, double b){
        double resultado = a - b;
        System.out.println("A subtracao de "+ a + " menos " + b +" resulta em " + resultado);
    }
    public static void multiplicar(double a, double b){
        double resultado = a * b;
        System.out.println("A multiplicacao de "+ a + " por " + b +" resulta em " + resultado);
    }
    public static void dividir(double a, double b){
        double resultado = a / b;
        System.out.println("A divisao de "+ a + " por " + b +" resulta em " + resultado);
    }

}
