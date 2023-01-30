package Curso3;

public abstract class Funcionario {
  private String nome;
  private String cpf;
  private double salario;

  public Funcionario(String nome, String cpf, double salario) {
    this.nome = nome;
    this.cpf = cpf;
    this.salario = salario;
  }

  // Método abstrato não tem corpo, não tem implementação.
  public abstract double getBonificacao();

  public String getNome() {
    return nome;
  }

  public String getCpf() {
    return cpf;
  }

  public double getSalario() {
    return salario;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }
}
