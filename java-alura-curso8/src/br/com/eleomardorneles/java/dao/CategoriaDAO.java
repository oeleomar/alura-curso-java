package br.com.eleomardorneles.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.eleomardorneles.java.modelo.Categoria;

public class CategoriaDAO {
  private Connection connection;

  public CategoriaDAO(Connection connection) {
    this.connection = connection;
  }

  public List<Categoria> listar() throws SQLException {
    List<Categoria> categorias = new ArrayList<>();

    String sql = "SELECT id, nome FROM categoria";

    try (PreparedStatement pstm = this.connection.prepareStatement(sql);) {
      pstm.execute();

      try (ResultSet rst = pstm.getResultSet()) {
        while (rst.next()) {
          categorias.add(new Categoria(rst.getInt("ID"), rst.getString("NOME")));
        }
      }
    }

    return categorias;

  }
}
