package EX17;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class NinjaAvancado extends NinjaBasico implements Ninja{

    String nome;
    int idade;
    double altura;
    String aldeia;
    String sexo;
    String habilidade;
    String especialidade;

//constructor
    public NinjaAvancado(String nome, int idade, double altura, String aldeia, String sexo, String habilidade, String especialidade){

        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.aldeia = aldeia;
        this.sexo = sexo;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Habilidade: " + this.habilidade);
        System.out.println("Especialidade: " + this.especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Executando Habilidade " + this.especialidade + "!");
    }
}
