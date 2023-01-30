package Curso3;

public class Designer extends Funcionario {
  public Designer() {
  }

  @Override
  public double getBonificacao() {
    return super.getSalario() + 200;
  }
}
