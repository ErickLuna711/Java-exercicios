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
        Scanner input = new Scanner(System.in);

        ContaBanco contaCreusa = new ContaBanco("Creusa", 102, "cc");
        ContaBanco contaAlex = new ContaBanco("Alex", 103, "cp");

        int opcaoCliente;
        do {

            System.out.println("\n===== BANCO BOM BRASIL =====");
            System.out.println("Escolha um cliente:");
            System.out.println("1 - Creusa (Conta Corrente)");
            System.out.println("2 - Alex (Conta Poupança)");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");


            opcaoCliente = input.nextInt();
            ContaBanco contaSelecionada = null;
            switch (opcaoCliente) {
                case 1:
                    contaSelecionada = contaCreusa;
                    break;

                case 2:
                    contaSelecionada = contaAlex;
                    break;

                default:
                    System.out.println("Encerrando o sistema...");
            }


            if (contaSelecionada != null) {

                int opcao;
                do {

                    System.out.println("\n===== Bem-vindo(a), "
                            + contaSelecionada.getDono() + " =====");

                    System.out.println("1 - Informações da conta");
                    System.out.println("2 - Verificar dono");
                    System.out.println("3 - Verificar número da conta");
                    System.out.println("4 - Verificar saldo");
                    System.out.println("5 - Verificar status");
                    System.out.println("6 - Depositar");
                    System.out.println("7 - Sacar");
                    System.out.println("8 - Pagar mensalidade");
                    System.out.println("9 - Voltar ao menu principal");

                    System.out.print("Escolha uma opção: ");
                    opcao = input.nextInt();

                    switch (opcao) {

                        case 1:
                            contaSelecionada.infoConta();
                            break;

                        case 2:
                            System.out.println("Dono: "
                                    + contaSelecionada.getDono());
                            break;

                        case 3:
                            System.out.println("Número da conta: "
                                    + contaSelecionada.getNumConta());
                            break;

                        case 4:
                            System.out.println("Saldo atual: R$"
                                    + contaSelecionada.getSaldo());
                            break;

                        case 5:
                            System.out.println("Status da conta: "
                                    + contaSelecionada.getStatus());
                            break;

                        case 6:
                            System.out.print("Valor do depósito: R$");
                            double deposito = input.nextDouble();

                            contaSelecionada.depositar(deposito);
                            break;

                        case 7:
                            System.out.print("Valor do saque: R$");
                            double saque = input.nextDouble();

                            contaSelecionada.sacar(saque);
                            break;

                        case 8:
                            contaSelecionada.pagarMensal();

                            System.out.println(
                                    "Mensalidade paga com sucesso!");
                            System.out.println("Saldo atual: R$"
                                    + contaSelecionada.getSaldo());
                            break;

                        case 9:
                            System.out.println("Voltando ao menu principal...");
                            break;

                        default:
                            System.out.println("Opção inválida!");
                    }

                } while (opcao != 9);
            }

        } while (opcaoCliente != 3);

        input.close();
    }
}


