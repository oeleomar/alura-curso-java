package Curso3;

public class TesteSistema {
  public static void main(String[] args) {
    System.out.println("SISTEMA INTERNO");

    Gerente gerente = new Gerente();
    Administrador administrador = new Administrador();
    gerente.setSenha(2222);
    administrador.setSenha(2222);

    SistemaInterno sistemaInterno = new SistemaInterno();

    sistemaInterno.autentica(gerente);
    sistemaInterno.autentica(administrador);
  }
}
