package br.com.eleomardorneles.java;

public class TestaCurso {
  public static void main(String[] args) {
    Curso javaCollections = new Curso("Dominando Coleções em Java", "Eleomar Dorneles");

    javaCollections.adiciona(new Aula("Como usar um ArrayList", 21));
    javaCollections.adiciona(new Aula("Criando uma Aula", 20));
    javaCollections.adiciona(new Aula("Modelando Coleções", 22));
    // PARA REMOVER O MÉTODO ADD DE LISTAS.
    // Collections.unmodifiableList(lista) -> devolve uma lista imutável. Sem
    // métodos add ou remove

    System.out.println(javaCollections.getAulas());
  }
}
