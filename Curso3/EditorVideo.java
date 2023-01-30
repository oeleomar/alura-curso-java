package Curso3;

public class EditorVideo extends Funcionario {
  public EditorVideo() {
  }

  @Override
  public double getBonificacao() {
    return super.getSalario() + 500;
  }
}
