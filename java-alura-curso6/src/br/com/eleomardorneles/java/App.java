package br.com.eleomardorneles.java;

public class App {
    public static void main(String[] args) {
        int idade1 = 29;
        int idade2 = 29;
        int idade3 = 29;

        // Estruturas mais primitiva
        // Array []
        int[] idades = new int[5]; // Informando o tamanho do array
        // Já inicializa os Arrays com valores padrão
        idades[0] = 10;
        idades[1] = 20;
        idades[2] = 30;
        idades[3] = 40;
        idades[4] = 50;

        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }
    }
}
