package br.com.dio;

import br.com.dio.model.Gato;

public class Main {
    public static void main(String[] args) {
/*        int a = 5;
        int b = 3;

        System.out.println("Hello World" + (a + b));*/
        Gato gato = new Gato();

        System.out.println(gato);

        Livro livro = new Livro( "Eragon", 356);




    }



}

class Livro{
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}