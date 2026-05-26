package EX11ninja;

public class Main {
    //Estudo sobre Herança
    static void main(String[] args) {

        //Naruto uzumaki
        Ninja naruto = new Ninja();
        naruto.nome = "Naruto uzumaki";
        naruto.idade = 17;
        naruto.aldeia = "Folha";
        naruto.ninjaStats();



        //Sakura Haruno
        Ninja sakura = new Ninja();
        sakura.nome = "Sakura Haruno";
        sakura.idade = 18;
        sakura.aldeia = "Folha";
        sakura.ninjaStats();


        //Sasuke filho da classe ninja

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke uchiha";
        sasuke.idade = 18;
        sasuke.aldeia = "Folha";
        sasuke.habilidadeEspecial = "sharingan";
        //todos possuem acesso.
        sasuke.ninjaStats();


    }
}
