package Curso3;

public class SistemaInterno {
  private int senha = 2222;

  public void autentica(FuncionarioAutenticavel funcionario) {
    boolean autentica = funcionario.autentica(this.senha);
    if (autentica) {
      System.out.println("Entrada permitida");
    } else {
      System.out.println("Entrada não autorizada.");
    }
  }
}
