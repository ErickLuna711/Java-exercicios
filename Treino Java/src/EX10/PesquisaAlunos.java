/*
    A escola tem M turmas e oferece N tipos diferentes de frutas.
    Em cada turma, para cada fruta, foi informado o numero de alunos que gostam daquela fruta.
    Contudo, como a SBC não teve acesso aos dados individuais dos alunos, nem sabe quantos alunos
    há em cada turma, precisa agora de sua ajuda! Com base apenas nos resultados da pesquisa (quantos
    alunos gostam de cada fruta em cada turma), determine o menor numero possivel de alunos que a
    escola pode ter, sabendo que as seguintes restrições são obedecidas:
        • cada turma tem pelo menos um aluno;
        • cada aluno pertence a uma unica turma;
        • cada aluno gosta de pelo menos uma fruta;
        • um mesmo aluno pode gostar de varias frutas
 */


package EX10;

import java.util.Scanner;

public class PesquisaAlunos {
    static void main(String[] args) {
        int[][] m = {
                {5, 2, 4},
                {4, 3, 6},
                }; //frutas turmas
        int maiorElemento = 0;
        int somaElementos = 0;
        Scanner input = new Scanner(System.in);
        
        for(int i= 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                //linha coluna
                System.out.println("Linha: " + j + " Coluna: " + i + " : " + m[j][i]);
                if(m[j][i] >= maiorElemento){
                    maiorElemento = m[j][i];
                    System.out.println("Encontrei o valor: " + m[j][i]);
                }
            }
            somaElementos += maiorElemento;
            maiorElemento = 0;
        }

        System.out.println("A quantidade de alunos é: " + somaElementos);
    }




}
