package br.com.eleomardorneles.java;

import java.util.ArrayList;
import java.util.List;

public class TestaListaOrdenadasImutaveis {
  public static void main(String[] args) {
    Curso javaCollections = new Curso("Dominando Coleções em Java", "Eleomar Dorneles");

    javaCollections.adiciona(new Aula("Como usar um ArrayList", 21));
    javaCollections.adiciona(new Aula("Criando uma Aula", 20));
    javaCollections.adiciona(new Aula("Modelando Coleções", 22));
    // PARA REMOVER O MÉTODO ADD DE LISTAS.
    // Collections.unmodifiableList(lista) -> devolve uma lista imutável. Sem
    // métodos add ou remove
    List<Aula> listaImutavel = javaCollections.getAulas();

    // Fazer uma cópia do array quando não quero mudar a propriedade imutável dele
    List<Aula> listaMutavel = new ArrayList<>(listaImutavel);

    // Retornando o tempo total do curso
    System.out.println(javaCollections.getTempoTotal());

    // Mostrando o curso
    System.out.println(javaCollections);
  }

}
