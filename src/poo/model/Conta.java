package poo.model;

public abstract class Conta implements IConta {
    protected static int AGENCIA_PADRAO = 1;
    public static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }
    @Override
    public void sacar(double valor){
        saldo = saldo - valor; // saldo -= valor;

    }
    @Override
    public void depositar(double valor){
        saldo = saldo + valor; // saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino){
        this.sacar (valor);
        contaDestino.depositar(valor);
    }



    public int getAgencia(){
        return agencia;
    }

    public int getNumero(){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }


    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    protected void  imprimirExtrato() {
        System.out.println(String.format("Agencia: %d", agencia));
        System.out.println(String.format("Numero: %d", numero));
        System.out.println(String.format("Saldo: %f%n", saldo));
    }


}
