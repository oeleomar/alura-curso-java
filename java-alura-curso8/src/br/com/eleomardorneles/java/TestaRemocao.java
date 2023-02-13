package br.com.eleomardorneles.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.eleomardorneles.java.factory.ConnectionFactory;

public class TestaRemocao {
  public static void main(String[] args) throws SQLException {
    Integer index = 9;
    ConnectionFactory connectionFactory = new ConnectionFactory();
    Connection connection = connectionFactory.recoveryConnection();

    PreparedStatement statement = connection.prepareStatement("DELETE FROM PRODUTO WHERE ID < ?");

    // Setando o atributo no ? no index 1 pois começa do 1
    statement.setInt(1, index);

    statement.execute();

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
