package Curso3;

public class Cliente implements Autenticavel {
  private AutenticavelUtil autenticador;

  public Cliente() {
    this.autenticador = new AutenticavelUtil();
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
