/*
        Faça uma função que recebe uma matriz A[6][6] e retorna a soma dos
    elementos da sua diagonal principal e da sua diagonal secundária.
 */


package EX18;

import java.util.Scanner;

public class SomaMatrizDiagonal {

    public static void main(String[] args) {
        //popula a matriz 6x6

        int A[][] = {{23,44,12,32,10,32},
                     {31,22,10,94,11,74},
                     {1,32,41,23,11,10},
                     {99,75,21,23,10,33},
                     {29,23,10,32,11,97},
                     {10,23,12,23,11,95}
        };

        //uma variavel auxiliar, e outra para guardar a soma
        int aux = 0;
        int soma = 0;
        //loop para correr pela matriz lendo os numeros
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {

                //se a linha e a coluna for igual a variavel auxiliar
                if (i == aux && j == aux) {
                    //adiciona mais 1 a variavel auxiliar
                    ++aux;
                    //adiciona o valor dentro da matriz
                    soma += A[i][j];
                    //print para mostrar que deu certo
                    System.out.println(A[i][j] + "Diagonal Found");

                }
            }
        }
        //resultado da soma
        System.out.println(soma);
    }
}
