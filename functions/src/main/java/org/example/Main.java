package org.example;

public class Main {

    public static void main(String[] args) {

        int resultado = soma(2, 3);

        System.out.println(resultado);

        int resultado1 = subt (10, 5);

        System.out.println(resultado1);
    }

    private static int subt(int c, int d) {

        return c - d;

    }

    public static int soma (int a, int b) {

        return a + b;

    }
}
