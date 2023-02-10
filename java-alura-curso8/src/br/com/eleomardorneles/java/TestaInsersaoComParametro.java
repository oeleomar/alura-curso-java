package br.com.eleomardorneles.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsersaoComParametro {
  public static void main(String[] args) throws SQLException {
    // Evitando SQL INJECTION
    String nome = "Nintendo Switch'); DELETE FROM PRODUTO";
    String descricao = "Video game";

    Connection connection = ConnectionFactory.recoveryConnection();

    // Ao invés de criar, eu preparo um statement para evista SQL injections
    // Criando o comando SQL
    String sql = "INSERT INTO PRODUTO (nome, descricao) VALUES (?, ?)";
    // Preparando o PreparedStatement se eu quiser as chaves adicionadas
    PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

    // Setando os valores dos ? do statemente por INDEX começando do 1
    statement.setString(1, nome);
    statement.setString(2, descricao);

    // Executando
    statement.execute();
    // Buscando as chaves adicionadas
    ResultSet result = statement.getGeneratedKeys();
    while (result.next()) {
      // Tenho que fazer pelo INDEX agora
      Integer id = result.getInt(1);
      System.out.println("O ID criado foi: " + id);

    }

    connection.close();
  }

}
