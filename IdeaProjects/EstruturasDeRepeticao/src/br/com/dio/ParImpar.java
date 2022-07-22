package br.com.dio;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {

        System.out.println("Digite um numero N:");
        Scanner scan = new Scanner(System.in);
        int N, par=0, impar=0, leitura;
        N = scan.nextInt();

        System.out.println("Digite os numeros: ");
        do {
            leitura = scan.nextInt();
            if (leitura%2==0){
                par++;
            }else{
                impar++;
            }
            N--;
        }while (N>0);

        System.out.println("Pares: " + par);
        System.out.println("Impares: " +impar);

    }

}
