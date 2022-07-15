package br.com.dio.metodos;

import java.util.Calendar;
import java.util.Date;

public class Mensagem {


    public static String getSaudacao(int hora) {
        return hora < 12 ? "Bom dia" : hora < 18 ? "Boa tarde" : "Boa noite";
    }
}
