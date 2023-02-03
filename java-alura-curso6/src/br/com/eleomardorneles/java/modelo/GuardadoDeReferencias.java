package br.com.eleomardorneles.java.modelo;

public class GuardadoDeReferencias {
  private Conta[] referencias;
  private int posicaoLivre;

  public GuardadoDeReferencias() {
    this.referencias = new Conta[10];
    posicaoLivre = 0;
  }

  public void adiciona(Conta ref) {
    this.referencias[this.posicaoLivre] = ref;
    posicaoLivre++;
  }

  public int getQuantidade() {
    return posicaoLivre;
  }

  public Conta getReferencia(int i) {
    return referencias[i];
  }
}
