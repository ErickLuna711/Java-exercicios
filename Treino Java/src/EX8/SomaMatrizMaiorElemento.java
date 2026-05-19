/*
    Faça um programa que carregue uma matriz 2x2
    calcule e mostre uma matriz resultante que será a matriz digitada multiplicada pelo maior elemento da matriz
    Exercicio proposto pela professora Fernanda Schmitz na FATEC.
 */

package EX8;

import java.util.Scanner;

public class SomaMatrizMaiorElemento {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] m = new int[2][2];
        int[][] mSomada = new int[2][2];
        int maiorValor = 0;

        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m.length; j++ ){
                m[i][j] = input.nextInt();
                if (m[i][j] > maiorValor) {
                    maiorValor = m[i][j];
                }
            }
        }

        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m.length; j++ ){
                mSomada[i][j] = m[i][j] * maiorValor;
                System.out.println(mSomada[i][j]);
            }
        }



    }
}
