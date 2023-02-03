package br.com.eleomardorneles.java.test;

import br.com.eleomardorneles.java.modelo.ContaCorrente;
import br.com.eleomardorneles.java.modelo.ContaPoupanca;
import br.com.eleomardorneles.java.modelo.Conta;

public class TesteArrayReferencias {
  public static void main(String[] args) {
    ContaCorrente cc1 = new ContaCorrente(222, 222);
    ContaPoupanca cb1 = new ContaPoupanca(111, 111);

    Conta[] arrayContas = new Conta[2];
    arrayContas[0] = cc1;
    arrayContas[1] = cb1;

    // Estou forcando o compilador a aceitar um tipo mais específico que CONTA
    ContaCorrente ref = (ContaCorrente) arrayContas[0];// Type cast
    System.out.println(ref.toString());

  }
}
