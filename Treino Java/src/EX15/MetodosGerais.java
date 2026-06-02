package EX15;

public class MetodosGerais {
    public static void main(String[] args) {
    Uchiha sasuke = new Uchiha();
    Uzumaki naruto = new Uzumaki();

    naruto.nome = "Naruto Uzumaki";
    naruto.idade = 18;
    naruto.aldeia = "Folha";
    //metodo sobrescrito no objeto filho uzumaki.
    naruto.habilidadeEspecial();

    sasuke.nome = "Sasuke Uchiha";
    sasuke.idade = 18;
    sasuke.aldeia = "Folha";
    //metodo sobrescrito no objeto filho uchiha.
    sasuke.habilidadeEspecial();
    }

}
