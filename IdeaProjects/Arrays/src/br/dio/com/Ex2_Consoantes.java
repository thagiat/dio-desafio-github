package br.dio.com;

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        char[] caracteres = new char[6];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i<5;i++) {
            caracteres[i] = scan.next().charAt(0);
        }

        int consoantes = 0;

        for (int j = 5; j>=0;j--){
            if(!(caracteres[j]=='a'||caracteres[j]=='e'||caracteres[j]=='i'||caracteres[j]=='o'||caracteres[j]=='u') ){
                consoantes++;
            }
        }
        System.out.println("Consoantes: "+ consoantes);
    }
}
