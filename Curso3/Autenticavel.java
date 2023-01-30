package Curso3;

//Interface é uma classe abstrata com todos os métodos abstratos
//Contrato autenticavel:
//Quem assina o contrato preciso implementar:
//Método setSenha
//Método Autentica

//Extends é para classes, implements é um contrato.
//Não é necessário digitar public abstract

public abstract interface Autenticavel {

  void setSenha(int senha);

  boolean autentica(int senha);
}
