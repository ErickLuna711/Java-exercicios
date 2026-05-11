/*
*
*   Exercicio proposto pelo professor gustavo guanabara do curso em video:
*   Crie um algoritmo usando POO para abertura de contas de banco, onde o cliente podera criar duas contas
*   uma conta corrente onde ele já começara com 50 reais, e uma conta poupança que rendera 5% e o cliente começara com 30 reais
*   e dois clientes, jubileu, e creusa, vão criar uma conta, jubileu ira criar uma conta poupança e depositar 300 reais
*   e a creusa, ira criar uma conta corrente e depositar 500 reais, e depois mais tarde eles irão sacar o dinheiro
*
 */


package EX4;

import java.util.Scanner;

public class BancoBomBrasil {

    public static void main(String[] args) {
        ContaBanco contaCreusa = new ContaBanco("Creusa", 102, "cc");
        ContaBanco contaAlex = new ContaBanco("Alex", 103, "cp");
        Scanner input = new Scanner(System.in);
        int contas = 0;

        while (contas != 3){
            System.out.println("\nEscolha um cliente: ");
            System.out.println("1° Creusa: conta corrente");
            System.out.println("2° Alex: conta Poupança");
            System.out.println("3° sair do programa");
            contas = input.nextInt();
            switch (contas){
                case 1:
                    int opcao = 0;
                    System.out.println("=====\nBem-Vindo(a) Creusa\n=====");
                    System.out.println("Selecione uma operação: ");
                    System.out.println("1° Informações da conta");
                    System.out.println("2° Verificar dono da conta");
                    System.out.println("3° Verificar Numero da conta");
                    System.out.println("4° Verificar saldo da conta");
                    System.out.println("5° Verificar status");
                    System.out.println("6° Realizar um deposito");
                    System.out.println("7° Realizar um saque");
                    System.out.println("8° Pagar Mensalidade");
                    System.out.println("9° Sair da conta");
                    opcao = input.nextInt();
                        switch (opcao) {
                            case 1:
                                contaCreusa.infoConta();
                                opcao = 0;
                                break;
                            case 2:
                                System.out.println("Dono: " + contaCreusa.getDono());
                                opcao = 0;
                                break;
                            case 3:
                                System.out.println("Numero da conta: " + contaCreusa.getNumConta());
                                opcao = 0;
                                break;
                            case 4:
                                System.out.println("Saldo atual: " + contaCreusa.getSaldo());
                                opcao = 0;
                                break;
                            case 5:
                                System.out.println("Ativada: " + contaCreusa.getStatus());
                                opcao = 0;
                                break;
                            case 6:
                                System.out.print("Digite a quantidade a depositar: ");
                                contaCreusa.depositar(input.nextInt());
                                opcao = 0;
                                break;
                            case 7:
                                System.out.print("Digite a quantidade do saque: ");
                                contaCreusa.sacar(input.nextInt());
                                opcao = 0;
                                break;
                            case 8:
                                contaCreusa.pagarMensal();
                                System.out.print("Mensalidade paga! sua conta agora possui: " + contaCreusa.getSaldo());
                                opcao = 0;
                                break;
                            case 9:
                                System.out.println("Voltando para a pagina inicial...");
                                break;
                        }
                    break;
                case 2:
                    int opcao2 = 0;
                    System.out.println("=====\nBem-Vindo(a) Alex\n=====");
                    System.out.println("Selecione uma operação: ");
                    System.out.println("1° Informações da conta");
                    System.out.println("2° Verificar dono da conta");
                    System.out.println("3° Verificar Numero da conta");
                    System.out.println("4° Verificar saldo da conta");
                    System.out.println("5° Verificar status");
                    System.out.println("6° Realizar um deposito");
                    System.out.println("7° Realizar um saque");
                    System.out.println("8° Pagar Mensalidade");
                    System.out.println("9° Sair da conta");
                    opcao2 = input.nextInt();
                    while (opcao2 !=9){
                    switch (opcao2) {

                            case 1:
                                contaAlex.infoConta();
                                opcao2 = 0;
                                break;
                            case 2:
                                System.out.println("Dono: " + contaAlex.getDono());
                                opcao2 = 0;
                                break;
                            case 3:
                                System.out.println("Numero da conta: " + contaAlex.getNumConta());
                                opcao2 = 0;
                                break;
                            case 4:
                                System.out.println("Saldo atual: " + contaAlex.getSaldo());
                                opcao2 = 0;
                                break;
                            case 5:
                                System.out.println("Ativada: " + contaAlex.getStatus());
                                opcao2 = 0;
                                break;
                            case 6:
                                System.out.print("Digite a quantidade a depositar: ");
                                contaAlex.depositar(input.nextInt());
                                opcao2 = 0;
                                break;
                            case 7:
                                System.out.print("Digite a quantidade do saque: ");
                                contaAlex.sacar(input.nextInt());
                                opcao2 = 0;
                                break;
                            case 8:
                                contaAlex.pagarMensal();
                                System.out.print("Mensalidade paga! sua conta agora possui: " + contaAlex.getSaldo());
                                opcao2 = 0;
                                break;
                            case 9:
                                System.out.println("Voltando para a pagina inicial...");
                                break;
                        }
                        break;
                }
            }
        }
    }
}
