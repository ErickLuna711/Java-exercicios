/*
    Uma loja de autopeças precisa controlar seu estoque. Escreva um programa que receba a quantidade em estoque
    de 6 produtos diferentes e armazene esses valores em um vetor. Em seguida, o programa deve pedir para o usuario
    digitar uma quantidade minima de segurança. Por fim, o programa deve varrer o vetor e exibir em quais posições(indices)
    estão os produtos que estão abaixo desse limite critico.

    Proposto pela professora Fernanda Schmitz na FATEC.
 */

package EX12;

import java.util.Scanner;

public class AutoPecas {
    public static void main(String[] args) {
        int produtos[] = new int[6];
        int quantidadeMinima;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de produtos maximo que o usuario pode colocar: ");
        quantidadeMinima = input.nextInt();

        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Digite a quantidade do produto: ");
            produtos[i] = input.nextInt();
        }

        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] <= quantidadeMinima) {
                System.out.println("[Aviso] Quantidade minima do produto " + i);
            }

        }


    }
}
