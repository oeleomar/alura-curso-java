package Curso3;

public class Gerente extends Funcionario implements Autenticavel {
  private AutenticavelUtil autenticador;

  public Gerente() {
    this.autenticador = new AutenticavelUtil();
  }

  @Override
  public double getBonificacao() {
    return super.getSalario() + 1000;
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
