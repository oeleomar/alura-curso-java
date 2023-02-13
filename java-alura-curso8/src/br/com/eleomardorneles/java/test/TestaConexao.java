package br.com.eleomardorneles.java.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConexao {
  public static void main(String[] args) throws SQLException {
    Connection connection = DriverManager.getConnection(
        "jdbc:mysql://localhost/loja_virtual?useTimezone=true&severTimezone=UTC",
        "root",
        "Eleomar-1907");

    connection.close();

  }
}
