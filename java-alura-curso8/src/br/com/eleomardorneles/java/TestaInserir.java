package br.com.eleomardorneles.java;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.eleomardorneles.java.factory.ConnectionFactory;

public class TestaInserir {
  public static void main(String[] args) throws SQLException {
    ConnectionFactory connectionFactory = new ConnectionFactory();
    Connection connection = connectionFactory.recoveryConnection();

    Statement statement = connection.createStatement();

    // LEMBRAR DAS ASPAS SIMPLES
    statement.execute(
        "INSERT INTO PRODUTO (nome, descricao) VALUES ('Nintendo Switch', 'Um video game muito legal para jogar com a familia')",
        Statement.RETURN_GENERATED_KEYS);

    ResultSet result = statement.getGeneratedKeys();
    while (result.next()) {
      // Tenho que fazer pelo INDEX agora
      Integer id = result.getInt(1);
      System.out.println("O ID criado foi: " + id);

    }

    connection.close();
  }

}
