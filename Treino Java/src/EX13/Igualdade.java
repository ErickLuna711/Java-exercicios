/*
    Fazer um programa que crie um vetor e peça para o usuario entrar com 12 valores inteiros e verificar se
    esses valores são iguais a sequencia do vetor abaixo:
    vet[12] = {1,6,5,8,9,7,4,8,10,15,2};
    Exiba a quantidade de numeros que são iguais a sequencia.

    Proposto pela professora Fernanda Schmitz na FATEC
 */

package EX13;


import java.util.Scanner;

public class Igualdade {
    public static void main(String[] args) {
        int vetReal[] = {1,6,5,8,9,7,4,8,10,15,2};
        int vetUser[] = new int[12];
        int totalNumeros = 0;
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < vetUser.length; i++){
            System.out.print("Digite o " + i + "° valor: ");
            vetUser[i] = input.nextInt();
        }

        for(int i = 0; i < vetReal.length; i++){
            if(vetUser[i] == vetReal[i]){
                ++totalNumeros;
            }
        }
        System.out.println("Temos um total de " + totalNumeros + " de numeros iguais neste vetor.");

    }


}
