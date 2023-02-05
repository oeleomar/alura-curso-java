package br.com.eleomardorneles.java.test.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.eleomardorneles.java.modelo.Conta;
import br.com.eleomardorneles.java.modelo.ContaCorrente;

public class TesteOrdenandoLista {
  public static void main(String[] args) {
    Conta cc1 = new ContaCorrente(111, 111);
    cc1.deposita(100);
    Conta cc2 = new ContaCorrente(111, 112);
    cc2.deposita(110);
    Conta cc3 = new ContaCorrente(111, 113);
    cc3.deposita(120);
    Conta cc4 = new ContaCorrente(111, 114);
    cc4.deposita(130);

    List<Conta> lista = new ArrayList<Conta>();
    lista.add(cc2);
    lista.add(cc3);
    lista.add(cc1);
    lista.add(cc4);

    for (Conta conta : lista) {
      System.out.println(conta);
    }

    // Forma menos usada, pois vou usar a instancia apenas uma vez.
    // NumeroContaComparator comparator = new NumeroContaComparator();
    // lista.sort(comparator);

    // Método bom
    lista.sort(new NumeroContaComparator());

    for (Conta conta : lista) {
      System.out.println(conta);
    }
  }
}

class NumeroContaComparator implements Comparator<Conta> {
  // Melhor método
  @Override
  public int compare(Conta o1, Conta o2) {
    // Usando o wrapper Integer
    return Integer.compare(o1.getNumero(), o2.getNumero());
  }

  /*
   * // Método mais simplificado
   * 
   * @Override
   * public int compare(Conta o1, Conta o2) {
   * return o1.getNumero() - o2.getNumero();
   * }
   */

  // Modelo ruim
  /*
   * @Override
   * public int compare(Conta o1, Conta o2) {
   * if (o1.getNumero() < o2.getNumero()) {
   * return -1;
   * }
   * if (o1.getNumero() > o2.getNumero()) {
   * return 1;
   * }
   * return 0;
   * }
   */

}