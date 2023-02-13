package br.com.eleomardorneles.java;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.eleomardorneles.java.dao.ProdutoDAO;
import br.com.eleomardorneles.java.factory.ConnectionFactory;
import br.com.eleomardorneles.java.modelo.Produto;

public class TestaInsercaoComProduto {
  public static void main(String[] args) throws SQLException {
    Produto videoGame = new Produto("Nintendo Switch", "Um video game para toda a familia");

    try (Connection connection = new ConnectionFactory().recoveryConnection()) {
      ProdutoDAO produtoDAO = new ProdutoDAO(connection);
      produtoDAO.salvar(videoGame);
      List<Produto> listaProdutos = produtoDAO.listar();

      listaProdutos.stream().forEach(produto -> System.out.println(produto));
    }
    System.out.println(videoGame);
  }
}
