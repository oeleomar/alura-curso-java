package br.com.eleomardorneles.java;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TesteTreeSet {
  public static void main(String[] args) {
    Recibo recibo1 = new Recibo(0001);
    Recibo recibo2 = new Recibo(0002);
    Recibo recibo3 = new Recibo(0003);
    Recibo recibo4 = new Recibo(0004);

    Set<Recibo> recibos = new TreeSet<>();
    // Sempre vai adicionar os elementos na ordem especificada no implements
    // Precisa que a classe recibo implements Comparator
    recibos.add(recibo4);
    recibos.add(recibo1);
    recibos.add(recibo3);
    recibos.add(recibo2);

    System.out.println(recibos);
  }
}
