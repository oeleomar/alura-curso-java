package br.com.eleomardorneles.java.test.util;

import java.util.ArrayList;

import br.com.eleomardorneles.java.modelo.Conta;
import br.com.eleomardorneles.java.modelo.ContaCorrente;

public class TesteArrayEquals {
  public static void main(String[] args) {

    ArrayList<Conta> list = new ArrayList<Conta>();

    Conta cc1 = new ContaCorrente(111, 111);
    Conta cc2 = new ContaCorrente(111, 111);
    Conta cc3 = new ContaCorrente(111, 111);

    list.add(cc1);
    list.add(cc2);
    list.add(cc3);

    // Verifica se existe a mesma referencia já
    // Overload no método equal eu posso agora comparar valores de objetos
    // E não somente referencias em memória
    System.out.println("Existe: " + list.contains(cc1));

    for (Conta refObject : list) {
      System.out.println(refObject);
    }
  }
}
