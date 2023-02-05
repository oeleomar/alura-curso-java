package br.com.eleomardorneles.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestandoLista {
  public static void main(String[] args) {
    String aula1 = "Conhecendo mais de listas";
    String aula2 = "Modelando a classe Aula";
    String aula3 = "Trabalhando com Cursos e Sets";

    List<String> listaString = new ArrayList<>();
    listaString.add(aula3);
    listaString.add(aula2);
    listaString.add(aula1);

    // System.out.println(listaString);

    listaString.remove(0);

    // System.out.println(listaString);

    listaString.forEach((string) -> System.out.println(string));

    // Só de passar a minhar lista já é ordenado em alfabética
    Collections.sort(listaString);

    listaString.forEach((string) -> System.out.println(string));
  }
}
