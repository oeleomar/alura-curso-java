package br.com.eleomardorneles.java;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Curso {
  private String nome;
  private String instrutor;
  private List<Aula> aulas = new LinkedList<>();
  private Set<Aluno> alunos = new HashSet<>();

  public Curso(String nome, String instrutor) {
    if (nome == null) {
      throw new NullPointerException("Nome não pode ser nulo");
    }
    this.nome = nome;
    this.instrutor = instrutor;
  }

  public List<Aula> getAulas() {
    return Collections.unmodifiableList(this.aulas);
  }

  public Set<Aluno> getAlunos() {
    return Collections.unmodifiableSet(this.alunos);
  }

  public String getNome() {
    return nome;
  }

  public String getInstrutor() {
    return instrutor;
  }

  public void adiciona(Aula aula) {
    this.aulas.add(aula);
  }

  public void matricular(Aluno aluno) {
    this.alunos.add(aluno);
  }

  public int getTempoTotal() {
    return this.aulas.stream().mapToInt(Aula::getTempo).sum();
  }

  @Override
  public String toString() {
    return "[Curso: " + this.nome + ", tempo total " + this.getTempoTotal() + "]";
  }

  public boolean estaMatriculado(Aluno a1) {
    return this.alunos.contains(a1);
  }

}
