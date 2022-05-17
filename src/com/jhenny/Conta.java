package com.jhenny;

public abstract class Conta implements IConta {

    private static final int agencia_padrao = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;


    public Conta(Cliente cliente) {
        this.agencia = Conta.agencia_padrao;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void sacar() {

    }

    public void depositar() {

    }

    public void transferir() {

    }

    public int getAgencia() {
        return this.agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public void sacar(double valor) {
        if ((saldo - valor) >= 0){
            this.saldo -= valor;
            System.out.format("saldo: %.2f\n ", this.saldo);

        }else{
            System.out.println("Saldo negativo");
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInformacoes() {
        System.out.format("titular: %s\n ", this.cliente.getNome());
        System.out.format("agencia: %d\n ", this.agencia);
        System.out.format("número: %d\n ", this.numero);
        System.out.format("saldo: %.2f\n ", this.saldo);
    }

}
