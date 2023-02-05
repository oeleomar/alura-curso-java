package br.com.eleomardorneles.java.test.util;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

import br.com.eleomardorneles.java.modelo.Cliente;
import br.com.eleomardorneles.java.modelo.Conta;
import br.com.eleomardorneles.java.modelo.ContaCorrente;

public class TesteLambdas {
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

    // Lambdas
    // Para deixar claro que é uma Lambda precisa de ->
    // Por baixos dos panos o java faz a mesma coisa para criar uma class que
    // executa esse método
    // Não preciso de new, Object, Implements
    // E caso a lambda tenha só 1 retorno no método, não preciso de chaves e da
    // palavra return
    // Auto retorno, igual functions on Javascript
    // Como estamos ordenando a lista de contas o Java já sabe que estamos
    // trabalhando com contas
    // Entao o (Conta o1, Conta o2) pode ser resumido em (o1, o2)
    lista.sort((o1, o2) -> Integer.compare(o1.getNumero(), o2.getNumero()));

    for (Conta conta : lista) {
      System.out.println(conta);
    }
  }
}
