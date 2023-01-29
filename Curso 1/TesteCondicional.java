
public class TesteCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		boolean valor = false;

		if (valor) {
			System.out.println("Entrei no condicional");
		} else if (!valor) {
			System.out.println("Entrei no else IF");
		}

		int idade = 18;
		int quantidadePessoas = 2;
		// Chaves são opcionais
		if (idade >= 18)
			System.out.println("Você tem mais que 18 anos");
		else if (quantidadePessoas > 1)
			System.out.println("Voce está acompanhado e pode entrar");
		else
			System.out.println("Voce não pode entrar");

	}
}
