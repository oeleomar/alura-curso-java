package br.com.eleomardorneles.java.test.util;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import br.com.eleomardorneles.java.modelo.Conta;
import br.com.eleomardorneles.java.modelo.ContaCorrente;

public class TesteLinkedList {
  public static void main(String[] args) {
    // Para iterar por um linkedList é menos eficiente pois sempre começa pelo
    // indice 0
    // Para adicionar ou remover itens do meio ou começo é mais eficiente
    // Compartilha do mesmos métodos que o ArrayList
    // Ambas assinaram o contrato com a interface List
    LinkedList<Conta> list = new LinkedList<Conta>();

    list.add(new ContaCorrente(111, 111));
    list.add(new ContaCorrente(222, 222));
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

    // Para transformar array em lista
    // Passando os String[] args de Array para Lista
    List<String> numeros = Arrays.asList(args);
  }
}
