package br.com.dio;

import java.util.Scanner;

public class Nota {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor;

        System.out.println("Digite uma nota entre 0 e 10: ");
        valor = scan.nextInt();
        while(valor<0 || valor>10){
            System.out.println("Digite um valor valido:");
            valor = scan.nextInt();
        }
    }

}
