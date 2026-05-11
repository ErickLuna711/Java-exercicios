package EX4;


public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;


    public ContaBanco(String criarDono, int criarNumConta, String criarTipo){
        setDono(criarDono);
        setNumConta(criarNumConta);
        setTipo(criarTipo);
         if(this.tipo == "cc"){
             this.saldo += 50;
         }else if(this.tipo == "cp") {
             this.saldo += 150;
         }
         this.status = true;
    }
    public void infoConta(){
        System.out.println("Numero da conta: " + getNumConta());
        System.out.println("Nome do Cliente: " + getDono());
        System.out.println("Tipo da conta: " + getTipo());
        System.out.println("Status da conta: " + getStatus());
        System.out.println("Saldo: " + getSaldo());
    }
    public void fecharConta(){
        if(this.saldo > 0){
            this.status = false;
        }
    }
    public void depositar(float quantidadeDeposito){
        if(this.status == true){
            this.saldo += quantidadeDeposito;
        }
    }
    public void sacar(float sacarSaldo){
        if(this.status == true && this.saldo > 0){
            this.saldo -= sacarSaldo;
        }
    }
    public void pagarMensal(){
        this.saldo -= 50;
    }
    public int getNumConta(){
        return this.numConta;
    }
    public void setNumConta(int numeroConta){
        this.numConta = numeroConta;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tipoConta){
        this.tipo = tipoConta;
    }
    public String getDono(){
        return this.dono;
    }
    public void setDono(String nomeDono){
        this.dono = nomeDono;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float saldoConta){
        this.saldo = saldoConta;
    }
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean statusConta){
        this.status = statusConta;
    }
}
