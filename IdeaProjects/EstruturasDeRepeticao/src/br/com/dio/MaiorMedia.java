package br.com.dio;

import java.util.Scanner;

public class MaiorMedia {

    public static void main(String[] args) {

        int maior=-9999, soma=0, leitura, i = 5;
        Scanner scan = new Scanner(System.in);

        do{
            leitura = scan.nextInt();
            soma+=leitura;
            if (leitura>maior){
                maior = leitura;
            }
            i--;
        }while (i>0);

        System.out.println("Media: " + soma/5);
        System.out.println("Maior: " + maior);

    }

}
