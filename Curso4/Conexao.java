package Curso4;

public class Conexao implements AutoCloseable {
  public Conexao() {
    System.out.println("Criando conexão");
  }

  public void leDados() {
    System.out.println("Lendo dados");
    throw new IllegalStateException();
  }
  /*
   * Ao invés de usar fecha conexão usa-se close.
   * 
   * public void fechaConexao() {
   * System.out.println("Fechando conexão.");
   * }
   */

  // Contrato do implements AutoCloseable
  @Override
  public void close() {
    System.out.println("Fechando conexão.");
  }

}
