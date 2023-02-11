package br.com.eleomardorneles.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.eleomardorneles.java.modelo.Produto;

public class ProdutoDAO {
  private Connection connection;

  public ProdutoDAO(Connection connection) {
    this.connection = connection;
  }

  public void salvar(Produto produto) throws SQLException {
    String sql = "INSERT INTO PRODUTO (nome, descricao) VALUES (?, ?)";

    try (PreparedStatement stm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
      stm.setString(1, produto.getNome());
      stm.setString(2, produto.getDescricao());

      stm.execute();

      try (ResultSet result = stm.getGeneratedKeys()) {
        while (result.next()) {
          produto.setId(result.getInt(1));
        }
      }

    }
  }

  public List<Produto> listar() throws SQLException {
    List<Produto> produtos = new ArrayList<>();
    String sql = "SELECT id, nome, descricao FROM produto";
    try (PreparedStatement stm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
      stm.execute();

      try (ResultSet rst = stm.getResultSet()) {
        while (rst.next()) {
          produtos.add(new Produto(rst.getInt("id"), rst.getString("nome"), rst.getString("descricao")));
        }
      }
    }
    return produtos;
  }
}
