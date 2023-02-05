package br.com.eleomardorneles.java.test.util;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

import br.com.eleomardorneles.java.modelo.Cliente;
import br.com.eleomardorneles.java.modelo.Conta;
import br.com.eleomardorneles.java.modelo.ContaCorrente;

public class TesteClassesAnonimas {
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

    // Classes anônimas
    // Classes declaradas que executam apenas 1 método é chamadas de Function object
    // Não é preciso criar todo um código, caso apenas eu queira uma classe que
    // executa uma função.
    // Por baixo dos panos o compilador irá criar uma classe, com uma nomeclatura
    // definida por ele.
    // Legibilidade bem complexa
    lista.sort(new Comparator<Conta>() {
      // Melhor método
      @Override
      public int compare(Conta o1, Conta o2) {
        // Usando o wrapper Integer
        return Integer.compare(o1.getNumero(), o2.getNumero());
      }
    });
    for (Conta conta : lista) {
      System.out.println(conta);
    }
  }
}
