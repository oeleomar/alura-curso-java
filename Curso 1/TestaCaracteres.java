
public class TestaCaracteres {
	public static void main(String[] args) {
		//Guarda um único caractere
		//Se usa aspas simples
		char letra = 'a';
		
		//Posso guardar valores da tabela UNICODE
		char valor = 65;
		System.out.println("A letra é " + letra + " O valor é " + valor);
		
		String palavra = "Curso da alura";
		System.out.println(palavra);
		
		palavra = palavra + " " + "- Oracle T3 ONE";
		System.out.println(palavra);
	}
}
