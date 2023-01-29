
public class TesteCondicional2 {
	public static void main(String[] args) {
		int idade = 18;
		int quantidadePessoas = 2;
		 
		// Chaves são opcionais
		
		//Operadores condicionais
		// || OU
		// && E
		if (idade >= 18 || quantidadePessoas >= 2)
			System.out.println("Você tem mais que 18 anos, pode entrar");
		else
			System.out.println("Voce não pode entrar");
	}
}
