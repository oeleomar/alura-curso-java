package br.com.eleomardorneles.java.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.eleomardorneles.java.factory.ConnectionFactory;

public class TestaListagem {
  public static void main(String[] args) throws SQLException {
    ConnectionFactory connectionFactory = new ConnectionFactory();
    Connection connection = connectionFactory.recoveryConnection();

    // Statements
    PreparedStatement statement = connection.prepareStatement("SELECT * FROM PRODUTO");

    // Executo o statement
    // Retorna um boolean me informando se o resultado é uma lista ou não
    // true = lista, false = nada
    statement.execute();

    // Buscar conteudos vindos da tabela
    ResultSet result = statement.getResultSet();

    // Buscar se existe próximo
    while (result.next()) {
      Integer id = result.getInt("ID");
      System.out.println(id);
      String nome = result.getString("NOME");
      System.out.println(nome);
      String descString = result.getString("DESCRICAO");
      System.out.println(descString);
      System.out.println("-------");
    }

    connection.close();

  }
}
