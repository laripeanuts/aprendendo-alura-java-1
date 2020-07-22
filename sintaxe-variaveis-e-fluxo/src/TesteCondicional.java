
public class TesteCondicional {

	public static void main(String[] args) {

		System.out.println("Testando condicionais:");

		int idade = 16;
		int quantidadePessoa = 1;
		
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos.");
			System.out.println("Seja bem vindo");
		} else {
			if (quantidadePessoa >= 2) {
			System.out.println("Você pode entrar pois está "
					+ "acompanhado");
			} else {
				System.out.println("Não pode entrar");
			
			}
		}

	}
	
}