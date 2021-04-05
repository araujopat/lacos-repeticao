
public class TestaCondicional2 {
	public static void main(String[] args) {

		System.out.println("Testando condicionais");
		int idade = 12;
		int quantidadePessoas = 3;
		 boolean acompanhado = quantidadePessoas >=3; // retona true ou false
		if (quantidadePessoas >= 2) {
			 acompanhado = true;// variaveis locais não tem valor padrão
		} else {
			 acompanhado = false;
		}
		if (idade >= 18 || acompanhado) {// operador ou &&-> operador e

			System.out.println("Você tem mais de 18 anos");
		} else {
			System.out.println("Infelizmente você não pode entrar");

		}
	}
}
