package br.dio.com;

import java.util.Random;

public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {

        int[][] matriz = new int[4][4];

        Random gerador = new Random();
        for (int i = 0; i<4;i++){
            for (int j=0;j<4;j++){
                matriz[i][j] = gerador.nextInt(0,9);
            }
        }

        int menorNumero = 9, positLinha=0, positColuna=0;

        for (int i = 0; i<4;i++){
            for (int j=0;j<4;j++){
                if(matriz[i][j]<menorNumero) {
                    menorNumero=matriz[i][j];
                    positLinha = i;
                    positColuna = j;
                }
            }
        }

        System.out.println("Menor: "+ menorNumero + "  Na Posicao ["+positLinha+"]["+positColuna+"]");

    }

}
