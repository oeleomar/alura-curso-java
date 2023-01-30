package Curso3;

public class Administrador extends Funcionario implements Autenticavel {
  private int senha;

  public Administrador() {
  };

  @Override
  public double getBonificacao() {
    return 0;
  }

  @Override
  public void setSenha(int senha) {
    this.senha = senha;
  }

  @Override
  public boolean autentica(int senha) {
    if (this.senha == senha)
      return true;

    return false;
  }

}
