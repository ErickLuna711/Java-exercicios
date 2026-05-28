package EX15;

public class Uchiha extends Ninja{

    /* O @Override indica que estamos sobrescrevendo um metodo herdado da classe pai (Ninja).
    Isso aplica o conceito de polimorfismo, permitindo que a classe filha (Uchiha)
    mude ou especifique o comportamento desse metodo para si mesma.
    */
    @Override
    public void habilidadeEspecial() {
        System.out.println("eu sou " + nome + " e esse é meu ataque Uchiha!");
    }
}
