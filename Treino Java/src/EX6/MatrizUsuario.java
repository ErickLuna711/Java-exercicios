/*
*
*   Criar um fluxograma e pseudocódigo que leia uma matriz 5X5 inteira e imprima uma determinada linha da matriz solicitada pelo usuário
*   Exercicio proposto pela professora Fernanda Schmitz na FATEC
 */


package EX6;

import java.util.Scanner;

public class MatrizUsuario {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matriz[][] = new int[5][5];
        byte opcao;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++ ){
                matriz[i][j] = j * 2;
            }
        }
        System.out.println("Digite a linha desejada: ");
        opcao = input.nextByte();
        for(int i = 0; i < matriz.length; i++){
            System.out.println(matriz[opcao][i]);
        }


    }



}
