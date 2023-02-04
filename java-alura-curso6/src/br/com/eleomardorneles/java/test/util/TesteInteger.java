package br.com.eleomardorneles.java.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteInteger {
  public static void main(String[] args) {
    // Para cada primitivo existe um objeto para representar ele
    int idade = 29; // Integer
    List numeros = new ArrayList();

    // Mesmo idade não sendo referencia e sim valor primitivo ele permite adicionar
    numeros.add(idade);// Transformação em primitivo para objeto se chama autoboxing
    // Unboxing do objeto para o tipo primitivo
    System.out.println(numeros.get(0));

    // Métodos classe Integer
    // Criar um objeto com valor inteiro
    // Autoboxing
    Integer inteiro = Integer.valueOf(30);
    // Buscar o valor inteiro armazenado no objeto
    // Unboxing
    int inteiro2 = inteiro.intValue();

    // Posso transformar strings em números
    // Chama-se parsing
    // Isso pega referencia e devolve o número
    System.out.println(Integer.valueOf(args[0]));
    // Transforma direto em número primitivo
    System.out.println(Integer.parseInt(args[0]));

    // Valor máximo
    System.out.println(Integer.MAX_VALUE);
    // Valor mínimo
    System.out.println(Integer.MIN_VALUE);
    // Valor em bits
    System.out.println(Integer.SIZE);
    // Valor em bytes
    System.out.println(Integer.BYTES);
  }
}
