/*
    Você vai criar um programa que gerencia diferentes
    tipos de ninjas, cada um com suas habilidades e
    informações. O objetivo é utilizar interfaces e
    polimorfismo para lidar com diferentes tipos de ninjas
    e suas habilidades.
        1. Crie uma interface chamada Ninja com dois
        métodos: mostrarInformacoes() para mostrar
        detalhes do ninja e executarHabilidade() para
        fazer o ninja usar sua habilidade.

        2. Crie uma classe chamada NinjaBásico que
        implementa a interface Ninja.

        3. Crie uma classe chamada NinjaAvançado que
        também implementa a interface Ninja. Além dos
        atributos nome, idade e habilidade, esta classe
        deve ter um atributo adicional chamado
        especialidade (uma habilidade especial do ninja).

        4. Mostre as informações e execute as habilidades
        de cada ninja usando os métodos que você
        implementou.



 */



package EX17;



public class Geral {

    static void main(String[] args) {
    NinjaAvancado katarina = new NinjaAvancado("katarina", 18, 1.70, "folha", "Masculino", "Desconstruir", "Assasino");
    NinjaBasico alex = new NinjaBasico("Alex", 17, 1.80, "folha", "Masculino", "dash");
    alex.mostrarInformacoes();
    System.out.println();
    katarina.mostrarInformacoes();
    katarina.executarHabilidade();

    }



}
