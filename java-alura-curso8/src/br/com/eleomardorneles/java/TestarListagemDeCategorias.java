package br.com.eleomardorneles.java;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.eleomardorneles.java.dao.CategoriaDAO;
import br.com.eleomardorneles.java.dao.ProdutoDAO;
import br.com.eleomardorneles.java.factory.ConnectionFactory;
import br.com.eleomardorneles.java.modelo.Categoria;
import br.com.eleomardorneles.java.modelo.Produto;

public class TestarListagemDeCategorias {
  public static void main(String[] args) throws SQLException {
    try (Connection connection = new ConnectionFactory().recoveryConnection()) {

      List<Categoria> listaDeCategorias = new CategoriaDAO(connection).listar();

      listaDeCategorias.stream().forEach(categoria -> {
        System.out.println(categoria);
        try {
          for (Produto produto : new ProdutoDAO(connection).buscar(categoria)) {
            System.out.println(categoria + " - " + produto.getNome());
          }
        } catch (SQLException e) {
          e.printStackTrace();
        }
      });
    }
  }
}
