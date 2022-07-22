package br.dio.com;

import java.util.Scanner;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] numerosInteiros = new int[5];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i<5;i++){
            numerosInteiros[i]= scan.nextInt();
        }

        System.out.println("Array inverso: ");
        for (int j = 4; j>=0;j--){
            System.out.println(numerosInteiros[j]);
        }

    }
}
