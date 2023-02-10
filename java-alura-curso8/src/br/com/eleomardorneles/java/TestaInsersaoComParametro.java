package br.com.eleomardorneles.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsersaoComParametro {
  public static void main(String[] args) throws SQLException {
    /*
     * // Evitando SQL INJECTION
     * String nome = "Nintendo Switch'); DELETE FROM PRODUTO";
     * String descricao = "Video game";
     */

    Connection connection = ConnectionFactory.recoveryConnection();
    // Eu vou escolher quando mandar para o DB
    // Se der erro não irá fazer nenhuma alteração no BD
    connection.setAutoCommit(false);

    // Ao invés de criar, eu preparo um statement para evista SQL injections
    // Criando o comando SQL
    String sql = "INSERT INTO PRODUTO (nome, descricao) VALUES (?, ?)";
    // Preparando o PreparedStatement se eu quiser as chaves adicionadas
    PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

    addVariables("Nintendo Switch", "Um video game muito legal", statement);
    addVariables("Smart TV Samsung", "Uma tv inteligente", statement);
    addVariables("Monito gaymer", "Um monitor para o público LGBTQIA+", statement);

    connection.close();
  }

  public static void addVariables(String nome, String descricao, PreparedStatement stm) throws SQLException {
    // Setando os valores dos ? do statemente por INDEX começando do 1
    stm.setString(1, nome);
    stm.setString(2, descricao);

    // Executando
    stm.execute();
    // Buscando as chaves adicionadas
    ResultSet result = stm.getGeneratedKeys();
    while (result.next()) {
      // Tenho que fazer pelo INDEX agora
      Integer id = result.getInt(1);
      System.out.println("O ID criado foi: " + id);

    }
  }

}
