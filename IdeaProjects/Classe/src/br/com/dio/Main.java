package br.com.dio;

public class Main {
    public static void main(String[] args) {

        Carro fusca = new Carro("azul","fusca",150);

        Carro ferrari = new Carro(200);
        ferrari.setCor("vermelha");
        ferrari.setModelo("ferrari");

        Carro corsa = new Carro(180);
        corsa.setCor("Branco");
        corsa.setModelo("corsa");

        System.out.println(ferrari.calculoEncherTanque(2.5));


    }

}
