package noobank;

public class Conta {

    private int id;
    private Pessoa titular;
    private String agencia;
    private double saldo;
    private double limite;
    private String dataAbertura;

    public Conta() {
    }

    public Conta(int id, Pessoa titular, String agencia, double saldo, double limite, String dataAbertura) {
        this.id = id;
        this.titular = titular;
        this.agencia = agencia;
        this.saldo = saldo;
        this.limite = limite;
        this.dataAbertura = dataAbertura;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
    
    public void sacar(double valor) throws OperacaoException{
        double saldoTotal = saldo + limite;
        
        if(valor > saldoTotal){
            throw new OperacaoException("Saldo insuficiente");
        }
        
        saldo = saldo - valor;
    }
    
    public void depositar(double valor){
        saldo = saldo + valor;
    }
    
    public double calculaRendimento(){
        return saldo * 0.1;
    }
    
    public void imprimirDetalhes(){
        System.out.println("Id:" + this.id);
        System.out.println("Titular:" + this.titular.getNome());
        System.out.println("Agencia:" + this.agencia);
        System.out.println("Saldo:" + this.saldo);
        System.out.println("Limite:" + this.limite);
        System.out.println("Saldo + limites: "+(saldo +limite));
        System.out.println("----------------------------------");
    }
    
    public void transferir(Conta conta, double valor) throws OperacaoException{
        double saldoTotal = saldo + limite;
        
        if(valor > saldoTotal){
            throw new OperacaoException("Saldo insuficiente");
        }
        
        this.sacar(valor);
        conta.depositar(valor);
    }
}
