package br.com.eleomardorneles.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
  public static Connection recoveryConnection() throws SQLException {
    return DriverManager.getConnection(
        "jdbc:mysql://localhost/loja_virtual?useTimezone=true&severTimezone=UTC",
        "root",
        "Eleomar-1907");
  }
}
