package EX17;

public class NinjaBasico implements  Ninja{
    String nome;
    int idade;
    double altura;
    String aldeia;
    String sexo;
    String habilidade;
    //construtor
    public NinjaBasico(String nome, int idade, double altura, String aldeia, String sexo, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.aldeia = aldeia;
        this.sexo = sexo;
        this.habilidade = habilidade;
    }

    public NinjaBasico() {
    }

    public void mostrarInformacoes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Habilidade: " + this.habilidade);
    }
    public void executarHabilidade(){
        System.out.println("");
    }
}
