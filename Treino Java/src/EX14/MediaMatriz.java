/*
    Fazer um programa para criar uma matriz de 3x4 e pedir para o usuario carregar os dados,
    depois varrer a matriz e achar o valor medio dos dados.

    Proposto pela professora Fernanda Schmitz na FATEC
 */

package EX14;

import java.util.Scanner;

public class MediaMatriz {
    static void main(String[] args) {
        int matriz[][] = new int[3][4];
        int media = 0;

        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print("Digite o valor da linha " + i + " e da coluna " + j + ": ");
                matriz[i][j] = input.nextInt();
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
            media += matriz[i][j];
            }
        }

        System.out.println("A media dos valores na matriz é: " + media/16);
    }
}
