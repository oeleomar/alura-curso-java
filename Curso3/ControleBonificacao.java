package Curso3;

public class ControleBonificacao {
  private double soma;

  // Funciona pois funcionario é a classe mais generica
  public void registra(Funcionario gerente) {
    double bonificacao = gerente.getBonificacao();
    this.soma += bonificacao;
  }

  public double getSoma() {
    return this.soma;
  }
}
