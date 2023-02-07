package br.com.eleomardorneles.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteListaAulas {
  public static void main(String[] args) {
    Aula a1 = new Aula("Revisitando as ArrayList", 21);
    Aula a2 = new Aula("Lista de objetos", 20);
    Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

    ArrayList<Aula> aulas = new ArrayList<>();
    aulas.add(a1);
    aulas.add(a2);
    aulas.add(a3);

    Collections.sort(aulas);

    // Quando eu quero ordenar de outra forma sem mexer na classe
    Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
    // Outra forma de fazer, porém mesmo resultado
    aulas.sort(Comparator.comparing(Aula::getTempo));
    // Ordenando por string
    aulas.sort(Comparator.comparing(Aula::getTitulo));

    aulas.forEach((aula) -> System.out.println(aula));
  }
}
