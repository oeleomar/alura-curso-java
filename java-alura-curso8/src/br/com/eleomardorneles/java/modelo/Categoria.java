package br.com.eleomardorneles.java.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Categoria {
  private Integer id;
  private String nome;
  List<Produto> produtos = new ArrayList<Produto>();

  public Categoria(Integer id, String nome) {
    this.id = id;
    this.nome = nome;
  }

  @Override
  public String toString() {
    return String.format("Categoria: %d %s", this.id, this.nome);
  }

  public String getNome() {
    return nome;
  }

  public Integer getId() {
    return id;
  }

  public void adicionar(Produto produto) {
    this.produtos.add(produto);
  }

  public List<Produto> getProdutos() {
    return Collections.unmodifiableList(this.produtos);
  }
}
