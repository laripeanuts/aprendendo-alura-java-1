
public class TesteCondicional {

	public static void main(String[] args) {

		System.out.println("Testando condicionais:");

		int idade = 16;
		int quantidadePessoa = 1;
		
		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos.");
			System.out.println("Seja bem vindo");
		} else {
			if (quantidadePessoa >= 2) {
			System.out.println("Voc� pode entrar pois est� "
					+ "acompanhado");
			} else {
				System.out.println("N�o pode entrar");
			
			}
		}

	}
	
}