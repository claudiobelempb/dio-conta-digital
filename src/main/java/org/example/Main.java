package org.example;

public class Main {
  public static void main(String[] args) {
    Cliente c1 = new Cliente();
    c1.setNome("Cardoso");
    c1.setTelefone("83999128978");

    Conta cc = new ContaCorrente(c1);
    cc.depositar(100);

    Conta cp = new ContaPoupanca(c1);
    cc.transferir(50, cp);

    cc.imprimirExtrato();
    cp.imprimirExtrato();
  }
}