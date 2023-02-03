package br.com.eleomardorneles.java.test;

import br.com.eleomardorneles.java.modelo.ContaCorrente;
import br.com.eleomardorneles.java.modelo.GuardadoDeReferencias;
import br.com.eleomardorneles.java.modelo.Conta;

public class TesteGuardador {
  public static void main(String[] args) {
    GuardadoDeReferencias guardador = new GuardadoDeReferencias();

    ContaCorrente cc = new ContaCorrente(111, 111);
    guardador.adiciona(cc);
    ContaCorrente cc2 = new ContaCorrente(111, 111);
    guardador.adiciona(cc2);

    int tamanho = guardador.getQuantidade();
    System.out.println(tamanho);

    Conta ref = guardador.getReferencia(0);
  }
}
