package br.com.eleomardorneles.java;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class TestandoOutrosTiposSet {
  public static void main(String[] args) {
    Curso javaCollections = new Curso("Dominando Coleções em Java", "Eleomar Dorneles");

    javaCollections.adiciona(new Aula("Como usar um ArrayList", 21));
    javaCollections.adiciona(new Aula("Criando uma Aula", 20));
    javaCollections.adiciona(new Aula("Modelando Coleções", 22));

    Aluno a1 = new Aluno("Eleomar Dorneles", 111);
    Aluno a2 = new Aluno("Segundo Aluno", 222);
    Aluno a3 = new Aluno("Terceiro Aluno", 333);
    Aluno a4 = new Aluno("Quarto Aluno", 333);

    javaCollections.matricular(a1);
    javaCollections.matricular(a2);
    javaCollections.matricular(a3);

    // Consegue guardar a ordem que os elementos são adicionados
    // Porém não é possivel acessar por get ou [] buscando por indices
    // Segue a mesma lógica dos outros hashSet, porém com a ordem guardada.
    Set<Aluno> linkedSet = new LinkedHashSet<>(javaCollections.getAlunos());

    // Apenas possivel quando implementado o método Comparable na classe
    // Construtor que recebe um comparator
    Set<Aluno> treeSet = new TreeSet<>();

    // Java Atual =
    javaCollections.getAlunos().forEach(aluno -> System.out.println("FOREACH ---- " + aluno));

    // Java 8 =
    for (Aluno aluno : javaCollections.getAlunos()) {
      System.out.println("FOR --- " + aluno);
    }

    // Antes da implementação do fori
    // Toda coleção tem ITERATOR seja Lista ou Set
    Iterator<Aluno> alunosIterator = javaCollections.getAlunos().iterator();
    // Pussui 3 métodos fundamentais
    // Utilizado com while
    while (alunosIterator.hasNext()) {
      Aluno proximoAluno = alunosIterator.next();
      System.out.println("ITERATOR ---- " + proximoAluno);
    }

    // Outras coisas olds
    Vector<Aluno> vetor = new Vector<>();
    // TreadSafe porém existem maneiras melhores de se trabalhar com tread safe
    // hoje em dia
  }
}
