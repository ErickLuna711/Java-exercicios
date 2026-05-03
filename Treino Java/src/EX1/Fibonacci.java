/** Exercicio proposto na FATEC PRAIA GRANDE pela professora Fernanda Schmitz
 *
 * Faça um programa que imprima a sequência de fibonacci, entrar com a quantidade de termos da sequência.
 *
 * **/

package EX1;

import java.util.Scanner;

public class Fibonacci {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n1 = 0, n2 = 1, n3, op;

        op = input.nextInt();

        for(int i = 0; i <= op; i++){

            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;

        }

    }
}
