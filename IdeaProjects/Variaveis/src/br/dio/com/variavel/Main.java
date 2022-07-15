package br.dio.com.variavel;

public class Main {
    public static void main(String[] args) {

        int i;
        //variaveis são case sensitive
        int I;
        //int 1a; - não devem começar com numeros

        // permitido mas não boa prática, começar com _ ou $
        int _1a;
        int $1a;

        //Boa pratica: váriaveis devem ser inicializadas
        i = 5;
        I = 4;
        _1a = 0;
        $1a = 54;

        final int j = 10;
        //j=15; - não é possivel já que a variavel é final

        int arhdsd554_543 = 100;
        // Boa pratica: variavel constante o nome ser em maiusculo
        final int NUMERO_TENTATIVA = 133;

        int QUANTIDADE_OPCOES = 25; // não segue boa prática, já que não é constante
        int qtdProd;//não segue boa prática, não é expressivo o suficiente

    }
}
