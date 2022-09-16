package org.example;

public class Main {
    public static void main(String[] args) {

        int nota = 70;

        //Nota maior ou igual a 70, aprovado.
        //if-else

        if (nota >= 70) {
            System.out.println("Aluno aprovado.");
        } else {
            System.out.println("Aluno reprovado.");
        }

        //A = 80, B = 70, C = 60, D = 0.

        int nota1 = 100;
        String graduacao;

        if (nota1 >= 80) {

            graduacao = "A";

        } else if (nota1 < 80 && nota1 >= 70) {

            graduacao = "B";

        } else if (nota1 < 70 && nota1 >= 60) {

            graduacao = "C";

        } else if (nota1 < 60 && nota1 >= 0) {

            graduacao = "D";

        } else {

            graduacao = "";

        }


        switch (graduacao) {

            case "A":

            case "B":
                System.out.println("Aluno aprovado.");
            break;

            case "C":

            case "D":
                System.out.println("Aluno reprovado.");
            break;

            default:
                System.out.println("Graduação inválida.");
        }

    }
}