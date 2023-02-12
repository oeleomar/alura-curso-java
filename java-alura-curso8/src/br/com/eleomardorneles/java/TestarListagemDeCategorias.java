package br.com.eleomardorneles.java;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.eleomardorneles.java.dao.CategoriaDAO;
import br.com.eleomardorneles.java.modelo.Categoria;

public class TestarListagemDeCategorias {
  public static void main(String[] args) throws SQLException {
    try (Connection connection = new ConnectionFactory().recoveryConnection()) {

      List<Categoria> listaDeCategorias = new CategoriaDAO(connection).listar();

      listaDeCategorias.stream().forEach(categoria -> System.out.println(categoria));
    }
  }
}
