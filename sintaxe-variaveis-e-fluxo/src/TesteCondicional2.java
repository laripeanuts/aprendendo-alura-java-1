
public class TesteCondicional2 {

	public static void main(String[] args) {

		System.out.println("Testando condicionais:");

		int idade = 20;
		int quantidadePessoa = 3;
		
		boolean acompanhado;
		
		if (quantidadePessoa >= 2) {
			acompanhado = true; 
		} else {
			acompanhado = false;
		}
		
		System.out.println("valor: " + acompanhado);

		if (idade >= 18 && acompanhado) {
			System.out.println("Você tem mais de 18 anos. Seja bem vindo!");

		} else {

			System.out.println("Não pode entrar");

		}

	}
}
