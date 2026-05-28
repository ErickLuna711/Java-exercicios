/*
    Uma pequena loja deseja registrar as vendas de 3 produtos diferentes durante 4 dias da semana.
    Escreva um programa em C++ que utilize uma matriz para armazenas esses dados
    (onde cada linha representa um produto e cada coluna representa um dia). Após preencher a matriz
    com os valores de vendas, o programa deve calcular e exibir o total vendido de cada produto
    ao longo de 4 dias (ou seja, a soma de cada linha).
 */

package EX16;

import java.util.Scanner;

public class VendasLoja {
   public static void main(String[] args) {

       int vendas[][] = new int[3][4];
       int aux = 0;
       Scanner input = new Scanner(System.in);


       //receber os valores do usuario
       for (int i = 0; i < vendas.length; i++) {
           for (int j = 0; j < vendas.length; j++) {
               System.out.print("Digite a quantidade de vendas do produto " + i + " no dia " + j +": ");
               vendas[i][j] = input.nextInt();
           }
       }
       //calcular e exibir a soma de todas as colunas por produto
       for (int i = 0; i < vendas.length; i++) {
           for (int j = 0; j < vendas.length; j++) {
               aux += vendas[i][j];
           }
           System.out.println("O total de vendas do produto " + i + " foi de: " + aux);
       }
   }
}
