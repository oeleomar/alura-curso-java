package Curso3;

public class TesteFuncionario {
  public static void main(String[] args) {
    Gerente gerente = new Gerente("Eleomar Dorneles", "000.000.000-00", 500, 12345678);

    EditorVideo editorVideo = new EditorVideo();
    editorVideo.setSalario(2000);

    Designer designer = new Designer();
    designer.setSalario(2500);

    ControleBonificacao controle = new ControleBonificacao();
    controle.registra(gerente);
    controle.registra(editorVideo);
    controle.registra(designer);

    System.out.println(controle.getSoma());
  }
}
