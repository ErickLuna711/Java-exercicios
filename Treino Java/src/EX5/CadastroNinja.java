/*
    Fazer um cadastro de ninjas usando arrays e switch cases para cadastrar novos ninjas com um menu interativo

    exercicio proposto pelo professor Horacio Mota do curso Java10X
 */


package EX5;

import java.util.Scanner;

public class CadastroNinja {
    static void main(String[] args) {
        byte opcao = 0;
        String[] ninja = new String[2];
        Scanner input = new Scanner(System.in);
        while (opcao != 3) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextByte();
            switch (opcao) {
                case 1:
                    input.nextLine();
                    System.out.println("Prencher a lista de ninjas: ");
                    for(int i = 0; i < ninja.length; i++){

                        System.out.print("Digite o nome do " + i + "° ninja: ");
                        ninja[i] = input.nextLine();

                    }
                    break;
                case 2:
                    System.out.println("Lista completa de ninjas: ");
                    for(int i = 0; i < ninja.length; i++){
                        System.out.println(i +"° " + ninja[i]);
                    }
                    break;
                default:
                    opcao = 3;
                    break;


            }
        }
    }
}
