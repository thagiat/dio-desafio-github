package br.com.dio.metodos;

import java.util.Scanner;

import static br.com.dio.metodos.Calculadora.*;
import static br.com.dio.metodos.Emprestimo.calculoEmprestimo;
import static br.com.dio.metodos.Mensagem.getSaudacao;

public class Main {
    public static void main(String[] args) {
        //Declaração  de variaveis
        Scanner scan = new Scanner(System.in);
        double a,b,valorEmprestimo,taxaEmprestimo;
        int d;

        //Saudação
        System.out.println("Que horas sao?");
        d = scan.nextInt() ;
        String saudacao = getSaudacao(d);

        System.out.println(saudacao + ", Primeiro as contas:");

        //Calculadora
        System.out.println("\nDigite o primeiro valor:");
        a = scan.nextDouble();
        System.out.println("Digite o segundo valor:");
        b = scan.nextDouble();

        somar(a,b);
        subtrair(a,b);
        multiplicar(a,b);
        dividir(a,b);

        //Emprestimo
        System.out.println("\nAgora o emprestimo, digite o valor que deseja:");

        valorEmprestimo = scan.nextDouble();
        System.out.println("Digite o numero de parcelas:");
        taxaEmprestimo = scan.nextDouble();
        calculoEmprestimo(valorEmprestimo,taxaEmprestimo);



    }
}
