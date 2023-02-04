package br.com.eleomardorneles.java.test.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.eleomardorneles.java.modelo.Cliente;
import br.com.eleomardorneles.java.modelo.Conta;
import br.com.eleomardorneles.java.modelo.ContaCorrente;

public class TesteOrdenandoStrings {
  public static void main(String[] args) {
    Conta cc1 = new ContaCorrente(11, 11);
    Cliente clienteC1 = new Cliente();
    clienteC1.setNome("Ana");
    cc1.setTitular(clienteC1);
    cc1.deposita(444);

    Conta cc2 = new ContaCorrente(22, 22);
    Cliente clienteC2 = new Cliente();
    clienteC2.setNome("Pedro");
    cc2.setTitular(clienteC2);
    cc2.deposita(444);

    Conta cc3 = new ContaCorrente(33, 33);
    Cliente clienteC3 = new Cliente();
    clienteC3.setNome("João");
    cc3.setTitular(clienteC3);
    cc3.deposita(444);

    Conta cc4 = new ContaCorrente(44, 44);
    Cliente clienteC4 = new Cliente();
    clienteC4.setNome("Carlos");
    cc4.setTitular(clienteC4);
    cc4.deposita(444);

    List<Conta> lista = new ArrayList<>();
    lista.add(cc1);
    lista.add(cc2);
    lista.add(cc3);
    lista.add(cc4);

    for (Conta conta : lista) {
      System.out.println(conta);
    }

    lista.sort(new TitularContaComparator());

    for (Conta conta : lista) {
      System.out.println(conta.getTitular().getNome());
    }
  }
}

class TitularContaComparator implements Comparator<Conta> {

  @Override
  public int compare(Conta o1, Conta o2) {
    // Comparar por string
    String nomeC1 = o1.getTitular().getNome();
    String nomeC2 = o2.getTitular().getNome();
    // Devolve 1 se for maior, -1 se for menor e 0 se for igual
    return nomeC1.compareTo(nomeC2);
  }

}