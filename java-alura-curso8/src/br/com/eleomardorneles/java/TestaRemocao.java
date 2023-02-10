package br.com.eleomardorneles.java;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaRemocao {
  public static void main(String[] args) throws SQLException {
    Connection connection = ConnectionFactory.recoveryConnection();

    Statement statement = connection.createStatement();
    statement.execute("DELETE FROM PRODUTO WHERE ID > 5", Statement.RETURN_GENERATED_KEYS);

    // Retorna um inteiro com quantas linhas foi modificado
    Integer result = statement.getUpdateCount();
    System.out.println(result);
    if (result > 0) {
      System.out.println("Deletado com sucesso, linhas afetadas: " + result);
    } else {
      System.out.println("Ocorreu algum erro ao deletar");
    }
    connection.close();
  }
}
