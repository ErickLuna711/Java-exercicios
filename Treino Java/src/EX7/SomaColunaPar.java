/*

    Criar um fluxograma e pseudocódigo que leia e armazene os elementos de uma matriz M 10x10
    inteiros e imprima a soma de todos os elementos das colunas pares.

    Exercicio proposto pela professora Fernanda Schmitz na FATEC.
 */

package EX7;


import java.util.Scanner;

public class SomaColunaPar {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m[][] = new int[3][3];
        int somaElementos = 0;
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m.length; j++ ) {
                m[i][j] = input.nextInt();
            }
        }
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m.length; j++ ) {
                if(j % 2 == 0){
                    somaElementos += m[i][j];
                }
            }
        }
        System.out.println("O total da soma das colunas pares da matriz total é: " + somaElementos);
    }
}
