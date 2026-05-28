package EX15;

public class MetodosGerais {
    public static void main(String[] args) {
    Uchiha sasuke = new Uchiha();
    Uzumaki naruto = new Uzumaki();

    naruto.nome = "naruto uzumaki";
    naruto.idade = 18;
    naruto.aldeia = "Folha";
    //metodo sobrescrito no objeto filho uzumaki.
    naruto.habilidadeEspecial();

    sasuke.nome = "sasuke uchiha";
    sasuke.idade = 18;
    sasuke.aldeia = "Folha";
    //metodo sobrescrito no objeto filho uchiha.
    sasuke.habilidadeEspecial();
    }

}
