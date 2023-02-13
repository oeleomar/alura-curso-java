package br.com.eleomardorneles.java;

import java.sql.SQLException;

import br.com.eleomardorneles.java.factory.ConnectionFactory;

public class TestaPoolDeConexoes {
  public static void main(String[] args) throws SQLException {
    ConnectionFactory connectionFactory = new ConnectionFactory();

    for (int i = 0; i < 20; i++) {
      connectionFactory.recoveryConnection();
      System.out.println("Conexão de número " + i);
    }
  }
}
