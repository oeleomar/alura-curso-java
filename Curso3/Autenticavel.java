package Curso3;

//Interface é uma classe abstrata com todos os métodos abstratos
//Contrato autenticavel:
//Quem assina o contrato preciso implementar:
//Método setSenha
//Método Autentica

//Extends é para classes, implements é um contrato.

public abstract interface Autenticavel {

  public abstract void setSenha(int senha);

  public abstract boolean autentica(int senha);
}
