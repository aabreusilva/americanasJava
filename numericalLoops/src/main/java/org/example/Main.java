package org.example;

public class Main {
    public static void main(String[] args) {

        //1 2 3 4 5 6 7 8 9 10.
        // para uma variavel que inicia em 1, e vai até 10, mudando 1 por 1, faça:
        //Laço dentro de outro. (Tabela periódica.)

        for (int i = 1; i <= 10; i++) {

            System.out.println("--------------");

            for (int j = 1; j <= 10; j++) {

                System.out.println(i + " X " +  j + " = " + j * i);

            }
        }

        System.out.println("--------------");

    }
}