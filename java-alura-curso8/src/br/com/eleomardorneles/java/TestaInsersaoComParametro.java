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
    // Fechando a conexão com o try with resources
    ConnectionFactory connectionFactory = new ConnectionFactory();

    try (Connection connection = connectionFactory.recoveryConnection();) {
      connection.setAutoCommit(false);

      // Ao invés de criar, eu preparo um statement para evista SQL injections
      // Criando o comando SQL
      String sql = "INSERT INTO PRODUTO (nome, descricao) VALUES (?, ?)";
      // Preparando o PreparedStatement se eu quiser as chaves adicionadas
      // Try com resursos já fechando o statement
      try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {

        addVariables("Nintendo Switch", "Um video game muito legal", statement);
        addVariables("Smart TV Samsung", "Uma tv inteligente", statement);
        addVariables("Monito gaymer", "Um monitor para o público LGBTQIA+", statement);
        // Só se todas as requisições acimas forem satisfeitas que todos vão ser
        // adicionados atraves do:
        connection.commit();
      } catch (Exception e) {
        e.printStackTrace();
        System.out.println("ROLLBACK realizado");
        connection.rollback();
      }

      // Eu vou escolher quando mandar para o DB
      // Se der erro não irá fazer nenhuma alteração no BD
      connection.close();
    }

  }

  public static void addVariables(String nome, String descricao, PreparedStatement stm) throws SQLException {
    // Setando os valores dos ? do statemente por INDEX começando do 1
    if (nome.equals("Nintendo Switch"))
      throw new RuntimeException("Não foi possível adicionar o produto");

    stm.setString(1, nome);
    stm.setString(2, descricao);

    // Executando
    stm.execute();
    // Buscando as chaves adicionadas

    // Já vai fechar o result, try with resourses
    try (ResultSet result = stm.getGeneratedKeys();) {
      while (result.next()) {
        // Tenho que fazer pelo INDEX agora
        Integer id = result.getInt(1);
        System.out.println("O ID criado foi: " + id);

      }
    }
  }

}
