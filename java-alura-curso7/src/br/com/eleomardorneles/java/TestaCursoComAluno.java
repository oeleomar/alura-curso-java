package br.com.eleomardorneles.java;

public class TestaCursoComAluno {
  public static void main(String[] args) {
    Curso javaCollections = new Curso("Dominando Coleções em Java", "Eleomar Dorneles");

    javaCollections.adiciona(new Aula("Como usar um ArrayList", 21));
    javaCollections.adiciona(new Aula("Criando uma Aula", 20));
    javaCollections.adiciona(new Aula("Modelando Coleções", 22));

    Aluno a1 = new Aluno("Eleomar Dorneles", 111);
    Aluno a2 = new Aluno("Segundo Aluno", 222);
    Aluno a3 = new Aluno("Terceiro Aluno", 333);
    Aluno a4 = new Aluno("Quarto Aluno", 333);

    javaCollections.matricular(a1);
    javaCollections.matricular(a2);
    javaCollections.matricular(a3);

    javaCollections.getAlunos().forEach(aluno -> System.out.println(aluno));

    // System.out.println(javaCollections.estaMatriculado(a1));
    // System.out.println(javaCollections.estaMatriculado(a4));

    // PROBLEMAS
    // Apenas reescrever o método equals não garante que um objeto pode ser
    // comparado a outro
    // Quando trabalhando com SET, é necessário reescrever o método hashCode também
    // Se um objeto é considerado igual ao outro, ele precisa ter o mesmo Código de
    // espalhamento (hashCode)
    Aluno eleomar = new Aluno("Eleomar Dorneles", 111);
    System.out.println(javaCollections.estaMatriculado(eleomar));
    System.out.println(eleomar.equals(a1));
  }
}
