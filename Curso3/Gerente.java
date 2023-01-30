package Curso3;

public class Gerente extends FuncionarioAutenticavel {
  @Override
  public double getBonificacao() {
    return super.getSalario() + 1000;
  }
}
