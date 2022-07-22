package br.com.dio;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        System.out.println("Digite o numero que deseja ver a tabuada:");
        int numTabuada;
        Scanner scan = new Scanner(System.in);
        numTabuada = scan.nextInt();

        System.out.println("Tabuada de "+ numTabuada+": ");
        for (int i = 0; i <= 10; i++){
            System.out.println(numTabuada + " X " + i + " = " + i*numTabuada);
        }

    }
}
