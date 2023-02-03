package br.com.eleomardorneles.java.test.util;

import java.util.ArrayList;

import br.com.eleomardorneles.java.modelo.Conta;
import br.com.eleomardorneles.java.modelo.ContaCorrente;

public class Test {
  public static void main(String[] args) {
    // Posso passar uma capacidade inicial
    ArrayList<String> nomes = new ArrayList<String>(10);
    // Posso criar outra lista baseada na primeira
    ArrayList<String> novaListaDeNomes = new ArrayList<String>(nomes);

    // Só guarda contas
    ArrayList<Conta> list = new ArrayList<Conta>();

    list.add(new ContaCorrente(111, 111));
    list.add(new ContaCorrente(222, 222));
    // Selecionando o índice
    list.add(2, new ContaCorrente(333, 333));

    System.out.println("Tamanho: " + list.size());
    System.out.println(list.get(0));
    System.out.println(list.remove(1));

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

    // Para cada objeto oRef da list executa:
    for (Conta refObject : list) {
      System.out.println(refObject);
    }

  }
}
