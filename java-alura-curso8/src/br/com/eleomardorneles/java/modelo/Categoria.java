package br.com.eleomardorneles.java.modelo;

public class Categoria {
  private Integer id;
  private String nome;

  public Categoria(Integer id, String nome) {
    this.id = id;
    this.nome = nome;
  }

  @Override
  public String toString() {
    return String.format("Categoria: %d %s", this.id, this.nome);
  }

  public Integer getId() {
    return id;
  }
}
