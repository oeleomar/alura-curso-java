package Curso3;

public class Administrador extends Funcionario implements Autenticavel {
  private AutenticavelUtil autenticador;

  public Administrador() {
    this.autenticador = new AutenticavelUtil();
  };

  @Override
  public double getBonificacao() {
    return 0;
  }

  @Override
  public void setSenha(int senha) {
    autenticador.setSenha(senha);
  }

  @Override
  public boolean autentica(int senha) {
    return autenticador.autentica(senha);
  }

}
