package org.example;

public abstract class Conta implements IConta{

  private static int AGENCIA_PADRAO = 1;
  private static int SEQUENCIAL = 1;

  protected int agencia;
  protected int numero;
  protected double saldo;

  protected Cliente cliente;

  public Conta(Cliente cliente) {
    this.agencia = AGENCIA_PADRAO;
    this.numero = SEQUENCIAL++;
    this.cliente = cliente;
  }

  @Override
  public void sacar(double valor) {
    this.saldo -= valor;
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

  protected void implimirInformacoes(){
    System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
    System.out.println(String.format("Telefone: %s", this.cliente.getTelefone()));
    System.out.println(String.format("Agencia: %d", this.agencia));
    System.out.println(String.format("Numero: %d", this.numero));
    System.out.printf(String.format("Saldo: %.2f", this.saldo));
    System.out.println();
  }
}
