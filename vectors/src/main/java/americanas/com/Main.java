package americanas.com;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Utilizando arrays.
//        int [] numeros = new int[5];
//        numeros[0] = 1;
//        numeros[1] = 2;
//        numeros[2] = 3;
//        numeros[3] = 4;
//        numeros[4] = 5;

        //Propriedade que indica o tamanho do meu array

//        for (int i = 0; i < numeros.length; i++) {
//
//            System.out.println(numeros[i]);
//
//        }

        //Utilizando letras.
//        String [] letras = new String[5];
//        letras[0] = "A";
//        letras[1] = "B";
//        letras[2] = "C";
//        letras[3] = "D";
//        letras[4] = "E";
//
//        for (int i = 0; i < letras.length; i++) {
//
//            System.out.println(letras[i]);
//
//        }

        //Outra forma de declarar arrays.

//        String [] letras = {"A", "B", "C", "D", "E"};
//
//        for (int i = 0; i < letras.length; i++) {
//
//            System.out.println(letras[i]);
//
//        }
//
//        System.out.println(Arrays.toString(letras));


        int [] numeros = {9, 10, 12, 25, 2};

        int maior = numeros[0];
        int menor = numeros[0];
        float media = (float) 0;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > maior) {

                maior = numeros[i];

            }

            if (numeros[i] < menor) {

                menor = numeros[i];

            }

            media += numeros[i];
            
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + media / numeros.length);
    }
}