package br.com.eleomardorneles.alura.test;

public class MinhaString {
  public static void main(String[] args) {
    String nome = "Eleomar Dorneles"; // Object literal
    String outroNome = new String("Outro Nome");
    // Char é sempre colocado com aspas simples ''
    char a = 'a';

    String novoNome = nome.replace('E', '.');
    String nomeMinusculo = nome.toLowerCase();
    String nomeMaiusculo = nome.toUpperCase();
    String trim = nome.trim();
    int indexOf = nome.indexOf('e');
    char b = nome.charAt(1);
    System.out.println(b);
  }
}
