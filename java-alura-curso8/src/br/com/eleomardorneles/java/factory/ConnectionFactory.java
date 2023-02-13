package br.com.eleomardorneles.java.factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
  public DataSource dataSource;

  public ConnectionFactory() {
    ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
    comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost/loja_virtual?useTimezone=true&severTimezone=UTC");
    comboPooledDataSource.setUser("root");
    comboPooledDataSource.setPassword("Eleomar-1907");
    comboPooledDataSource.setMaxPoolSize(15);

    this.dataSource = comboPooledDataSource;
  }

  public Connection recoveryConnection() throws SQLException {
    return this.dataSource.getConnection();
  }
}
