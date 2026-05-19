/*
    Faça um programa que carregue uma matriz 10x20 com números inteiros some cada uma das linhas, armazenando o resultado das somas em um vetor.
    A seguir, multiplique cada elemento da matriz pela soma da linha e mostre a matriz resultante.
    Exercicio proposto pela professora Fernanda Schmitz na FATEC.
 */

package EX9;

import java.util.Scanner;

public class MatrizMultiplicada {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] m = new int[10][20];
        int[][] matrizSomada = new int[10][20];
        int[] linhaSomada = new int[20];
        int soma = 0;

        System.out.println("Antes");

        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < 20; j++ ) {
                m[i][j] = j * 2;
                System.out.print(m[i][j] + " ");
                soma += m[i][j];
            }
            linhaSomada[i] = soma;
            System.out.println(" ");
        }

        System.out.println("Depois: ");
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < 20; j++ ){
                matrizSomada[i][j] += linhaSomada[i] * m[i][j];

                System.out.print(matrizSomada[i][j] + " ");
            }
            linhaSomada[i] = soma;
            System.out.println(" ");
        }
    }
}
