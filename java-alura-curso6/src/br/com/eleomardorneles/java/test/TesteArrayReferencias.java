package br.com.eleomardorneles.java.test;

import br.com.eleomardorneles.java.models.Conta;

public class TesteArrayReferencias {
  public static void main(String[] args) {
    // Array de referencias
    Conta conta1 = new Conta();
    Conta conta2 = new Conta();

    Conta[] contas = new Conta[2];
    for (int i = 0; i < contas.length; i++) {
      contas[i] = conta1;
      System.out.println(contas[i].getNome());
    }
  }
}
