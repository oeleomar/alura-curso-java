package br.com.eleomardorneles.java;

public class TestaBuscaAlunosNoCurso {
  public static void main(String[] args) {
    Curso javaCollections = new Curso("Dominando Coleções em Java", "Eleomar Dorneles");

    javaCollections.adiciona(new Aula("Como usar um ArrayList", 21));
    javaCollections.adiciona(new Aula("Criando uma Aula", 20));
    javaCollections.adiciona(new Aula("Modelando Coleções", 22));

    Aluno a1 = new Aluno("Eleomar Dorneles", 111);
    Aluno a2 = new Aluno("Segundo Aluno", 222);
    Aluno a3 = new Aluno("Terceiro Aluno", 333);

    javaCollections.matricular(a1);
    javaCollections.matricular(a2);
    javaCollections.matricular(a3);

    System.out.println("Quem é o aluno com matrícula 5617? ");
    // System.out.println(javaCollections.buscaPorMatricula(111));

    // Collection MAP
    // Iterar sobre
    javaCollections.getMatriculaParaAluno().keySet()
        .forEach(chave -> System.out.println(javaCollections.getMatriculaParaAluno().get(chave)));

    // Funciona como uma tabela
    // NÃO É FILHA DE COLLETION
    // No nosso caso é um mapa que tem um número que guarda o aluno
    // Método PUT recebe uma Chave e o Valor
    // Quando declarado Precisa ser como:
    // Map<Integer, TIPO> map = new HashMap<>();
    // Posso pesquisar se existe uma chave dentro através do método containsKey
    // LinkedHashMap é o mesmo só que guarda a ordem que foi adicionada
    // A chave precisa ser única caso contrário irá substituir o valor
  }
}
