package br.com.eleomardorneles.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TesteAlunos {
  public static void main(String[] args) {
    Set<String> alunos = new HashSet<>();

    alunos.add("Eleomar");
    alunos.add("Rodrigo");
    alunos.add("Joao");
    alunos.add("Dorneles");
    alunos.add("Maria");

    // Recurso a menos que a lista é a falta de necessidade de ordenação.
    // Set não consegue ordenar elementos
    // Método get não existe

    // Vantagens
    // Não adiciona objetos de valores repetidos
    // Velocidade e performance
    // Método CONTAINS | Remove -> muito mais rapido quando trabalhados com
    // conjuntos do que com Arrays e listas

    // Mesma coisa para buscar o size
    System.out.println(alunos.size());

    // Mesma coisa para iterar
    alunos.forEach(aluno -> System.out.println(aluno));

    // Método contains muito UTIL
    System.out.println(alunos.contains("Eleomar"));

    // Posso remover a partir do valor e não do INDEX
    System.out.println(alunos.remove("Eleomar"));

    System.out.println(alunos);

    // Caso seja necessário trabalhar com indices e listas é só converter

    List<String> alunosEmLista = new ArrayList<>(alunos);
    System.out.println(alunosEmLista);
  }
}
