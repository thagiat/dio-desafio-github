package br.com.dio;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        System.out.println("Digite o numero que deseja ver o fatorial:");
        int numFatorial, fatorial=1;
        Scanner scan = new Scanner(System.in);

        numFatorial = scan.nextInt();

        for (int i = numFatorial; i > 0; i--){
            fatorial*=i;
        }
        System.out.println("Fatorial de "+numFatorial+" = "+ fatorial);
    }
}
