package com.jhenny;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Cliente jhennyfer = new Cliente();
    jhennyfer.setNome("Jhennyfer");

    Conta cc = new ContaCorrente(jhennyfer);
    cc.depositar(100);

    Conta poupanca = new ContaPoupanca(jhennyfer);
    cc.transferir(100,poupanca);

    cc.sacar(150);
    cc.imprimirExtrato();
    poupanca.imprimirExtrato();



  }

}
