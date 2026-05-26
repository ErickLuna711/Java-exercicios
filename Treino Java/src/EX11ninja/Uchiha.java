package EX11ninja;

public class Uchiha extends Ninja{
    public String habilidadeEspecial;


    public void ninjaStats(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Aldeia: " + getAldeia());
        System.out.println("Habilidade especial: " + this.habilidadeEspecial);

    }



}
