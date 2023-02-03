package br.com.eleomardorneles.java.test;

public class TesteStringArray {
  public static void main(String[] args) {
    // Quando rodar no terminal
    // com o comando java <class>
    // Qualquer coisa que vier após a palavra class é um args
    // Logo para pegar os valors é só iterar sobre os args
    System.out.println("String array");
    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
    }
  }
}
