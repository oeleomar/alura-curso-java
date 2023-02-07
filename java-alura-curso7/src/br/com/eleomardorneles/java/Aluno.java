package br.com.eleomardorneles.java;

public class Aluno {
  private String nome;
  private int numeroMatricula;

  public Aluno(String nome, int numeroMatricula) {
    if (nome == null) {
      throw new NullPointerException("Nome não pode ser nulo");
    }
    this.nome = nome;
    this.numeroMatricula = numeroMatricula;
  }

  public String getNome() {
    return nome;
  }

  public int getNumeroMatricula() {
    return numeroMatricula;
  }

  @Override
  public String toString() {
    return "Aluno: " + this.nome + ", numero de matrícula: " + this.numeroMatricula;
  }

  @Override
  public boolean equals(Object obj) {
    Aluno a = (Aluno) obj;
    return this.nome.equals(a.getNome()) && this.numeroMatricula == a.numeroMatricula;
  }

  @Override
  public int hashCode() {
    // Vou separar por código segundo o primeiro caractere do nome.
    // return this.nome.charAt(0);
    // Porém classe String já possui um método hashCode bemmmm implementado
    return this.nome.hashCode();
  }
}
