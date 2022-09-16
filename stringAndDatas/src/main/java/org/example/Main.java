package org.example;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        //Olá, {nome}. Hoje é {dia-da-semana}, BOM DIA.

        String nome = "Alexandre";

        //Letras maiúsculas.
        System.out.println(nome.toUpperCase());

        //Letras minúsculas.
        System.out.println(nome.toLowerCase());

        //Quantos caracteres consultar.
        System.out.println(nome.length());


        String outroNome = "Maria Eduarda";

        //Operador (==) Comparando se são iguais.
        System.out.println(nome.equals(outroNome));


        //ISO 8601 Global data.

        //Dia de hoje referente ao tempo regional.
        LocalDate hoje = LocalDate.now();

        //Colocando como português Brasileiro.
        Locale brasil = new Locale("pt", "BR");

        //Dia da semana. Traduzindo para pt-BR.
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));



        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);

        String saudacao;

        //Obtendo a informação de horas atual.
        LocalDateTime agora = LocalDateTime.now();

        if (agora.getHour() >= 0 && agora.getHour() < 12) {

            saudacao = "Bom dia";

        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {

            saudacao = "Boa tarde";

        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {

            saudacao = "Boa noite";

        } else {

            saudacao = "Olá";

        }

        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());

    }
}