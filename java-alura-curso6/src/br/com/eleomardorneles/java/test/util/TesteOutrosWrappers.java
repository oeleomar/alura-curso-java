package br.com.eleomardorneles.java.test.util;

import java.util.ArrayList;

public class TesteOutrosWrappers {
  public static void main(String[] args) {
    Double dRef = Double.valueOf(0.0);
    System.out.println(dRef.doubleValue());

    // Autoboxing
    Long lRef = Long.valueOf(10000000);
    // Unboxing
    System.out.println(lRef.longValue());

    // TODOS EXTENDS A CLASSE NUMBER

    Number refNumber = Float.valueOf(0.99f);

    // Muito util para guardar em uma lista varios valores de numeros de tipos
    // diferentes

    ArrayList<Number> listaNumeros = new ArrayList<>();
    listaNumeros.add(0.00009999f);
    listaNumeros.add(10);
    listaNumeros.add(-100.0);
  }
}
