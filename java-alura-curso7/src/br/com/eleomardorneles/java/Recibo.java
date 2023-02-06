package br.com.eleomardorneles.java;

public class Recibo implements Comparable {
  private int numeroRecibo;

  public Recibo(int recibo) {
    this.numeroRecibo = recibo;
  }

  public int getNumeroRecibo() {
    return numeroRecibo;
  }

  @Override
  public int compareTo(Object o) {
    Recibo recibo = (Recibo) o;
    return this.numeroRecibo - recibo.numeroRecibo;
  }

  @Override
  public String toString() {
    return "[ Recibo número: " + this.numeroRecibo + " ]";
  }
}
