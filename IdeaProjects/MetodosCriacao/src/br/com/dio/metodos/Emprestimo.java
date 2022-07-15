package br.com.dio.metodos;

public class Emprestimo {

    public static void calculoEmprestimo(double valor, double taxa) {
        double juros = valor * taxa * 0.06;
        System.out.println("O valor total do emprestimo ficaria: "+ (valor+juros));
    }
}
