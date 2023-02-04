package br.com.eleomardorneles.java.test.util;

import java.util.List;
import java.util.Vector;

import br.com.eleomardorneles.java.modelo.Conta;
import br.com.eleomardorneles.java.modelo.ContaCorrente;

public class TesteVector {
  public static void main(String[] args) {
    // Vetores são thredsafe
    List<Conta> vetor = new Vector<Conta>();
    Conta cc = new ContaCorrente(111, 111);
    Conta cc2 = new ContaCorrente(111, 111);
    vetor.add(cc);
    vetor.add(cc2);

  }
}
