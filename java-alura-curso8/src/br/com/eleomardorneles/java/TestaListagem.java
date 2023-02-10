package br.com.eleomardorneles.java;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaListagem {
  public static void main(String[] args) throws SQLException {
    Connection connection = ConnectionFactory.recoveryConnection();

    // Statements
    Statement state = connection.createStatement();

    // Executo o statement
    // Retorna um boolean me informando se o resultado é uma lista ou não
    // true = lista, false = nada
    state.execute("SELECT * FROM PRODUTO");

    // Buscar conteudos vindos da tabela
    ResultSet result = state.getResultSet();

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
