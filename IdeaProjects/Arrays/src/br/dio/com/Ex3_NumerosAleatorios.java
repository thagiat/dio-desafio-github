package br.dio.com;

import java.util.Scanner;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {

        int[] numeros = new int[20];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i<20;i++){
            numeros[i]= scan.nextInt();
        }

        int sucessor;
        for (int i = 0; i<20;i++){
            sucessor =numeros[i]+1;
            System.out.println("Vetor ["+i+"] = "+numeros[i]+" e seu sucessor: "+sucessor);
        }

    }
}
