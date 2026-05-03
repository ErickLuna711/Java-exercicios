/** Exercicio proposto na FATEC PRAIA GRANDE pela professora Fernanda Schmitz
 * Faça um programa que receba o salário de 25 funcionários, calcule e exiba o novo salário desse funcionário com a bonificação e o auxílio-escola
 * SALÁRIO	BONIFICAÇÃO
 * Até R$ 1500,00: 5%
 * Entre R$ 1500,01 e R$ 2.200,00: 12%
 * Acima de R$ 2.200,00: Sem bonificação
 *
 * SALÁRIO	AUXILIO-ESCOLA
 * Até R$ 1.600,00: R$ 350,00
 * Mais de R$ 1.600,00:	R$ 300,00
 **/

package EX2;

import java.util.Scanner;

public class SalarioFuncionariosBonificados {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       int quantiadeFuncionarios;
       double  novoSalario, salario;
       String funcionario, bonificado, auxilio;

       System.out.println("Digite a quantidade de funcionarios: ");
       quantiadeFuncionarios = input.nextInt();
       System.out.println("Serão " + quantiadeFuncionarios + " funcionarios");
       input.nextLine();

       for(int i = 1; i <= quantiadeFuncionarios; i++){

           System.out.print("Digite o nome do funcionario: ");
           funcionario = input.nextLine();
           System.out.print("Digite o salario: ");
           salario = input.nextInt();

           if(salario <= 1500){
               novoSalario = salario + salario * 0.05;
               bonificado = "5%";
           } else if (salario >= 1500 && salario <= 2200) {
               novoSalario = salario + salario * 0.12;
               bonificado = "12%";
           }else{
               novoSalario = salario;
               bonificado = "Não esta apto!";
           }

           if(salario <= 1600){
               novoSalario += 350;
               auxilio = "R$ 350";
           }else{
               novoSalario += 300;
               auxilio = "R$ 300";
           }

           System.out.println("\nFuncionario: " + funcionario + "\nSalario antigo: " + salario + "\nNovo salario: " + novoSalario + "\nBonificação: " + bonificado + "\nauxilio: " + auxilio + "\n");
           input.nextLine();
       }
       input.close();
    }
}
