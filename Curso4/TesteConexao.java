package Curso4;

public class TesteConexao {
  public static void main(String[] args) {
    // Forma antiga
    Conexao con = null;
    try {
      con = new Conexao();
      con.leDados();
    } catch (Exception e) {
      System.out.println("Deu erro na conexão");
    } finally {
      if (con != null)
        con.close();
    }

    // Forma nova
    // Classe conexão precisa implementar a interface AutoCloseable
    // Contrato para criar um método close

    // Já inicia, le dados e caso haja erros já executo o close sem precisar do
    // finally
    try (Conexao conexao = new Conexao()) {
      conexao.leDados();
    } catch (Exception err) {
      System.out.println(err.getMessage());
    }
  }
}
