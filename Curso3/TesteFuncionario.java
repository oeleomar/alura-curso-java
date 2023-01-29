package Curso3;

public class TesteFuncionario {
  public static void main(String[] args) {
    Funcionario funcionario = new Funcionario("Eleomar Dorneles", "000.000.000-00", 2500);
    Gerente gerente = new Gerente("Eleomar Dorneles", "000.000.000-00", 2500, 12345678);
    System.out.println(gerente.autentica(12345678));
    
  }
}
