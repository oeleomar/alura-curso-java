package br.com.eleomardorneles.java.controller;

import java.sql.Connection;
import java.util.List;

import br.com.eleomardorneles.java.dao.CategoriaDAO;
import br.com.eleomardorneles.java.factory.ConnectionFactory;
import br.com.eleomardorneles.java.modelo.Categoria;

public class CategoriaController {
  private CategoriaDAO categoriaDAO;

  public CategoriaController() {
    Connection connection = new ConnectionFactory().recuperarConexao();
    this.categoriaDAO = new CategoriaDAO(connection);
  }

  public List<Categoria> listar() {
    return this.categoriaDAO.listar();
  }
}
