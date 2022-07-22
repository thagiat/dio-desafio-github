package br.com.dio;

import java.util.Scanner;

public class NomeIdade {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nomeAluno="Oi";
        int idade;

        while (!nomeAluno.equals("0")){
            System.out.println("Nome: ");
            nomeAluno = scan.next();
            System.out.println("Idade: ");
            idade = scan.nextInt();
            System.out.println(nomeAluno);
            System.out.println(idade);
        }

    }
}
