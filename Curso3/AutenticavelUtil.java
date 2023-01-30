package Curso3;

public class AutenticavelUtil {
  // Para repetição de código se usa COMPOSIÇÃO e não herança ou Polimorfismos ou
  // interfaces.
  // Chamando essa classe dentro do contrutor e instanciando ela lá.
  private int senha;

  public void setSenha(int senha) {
    this.senha = senha;
  }

  public boolean autentica(int senha) {
    if (this.senha == senha)
      return true;

    return false;
  }
}
