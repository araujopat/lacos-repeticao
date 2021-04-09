package teste;

public class TipoDeAnimal extends Animal{

	private String Acao;

	
	// constructor
	public TipoDeAnimal (String nome, int idade, String som, String acao)
	
	{
		super (nome, idade, som, acao);
		this.Acao = acao;
		
	}

	public String getAcao() {
		return Acao;
	}

	public void setAcao(String acao) {
		Acao = acao;
	}


	public static void main (String[] args)
	{
		Animal cachorro = new Animal("cachorro", 1, "au au au", "correr");
		Animal cavalo = new Animal("cavalo", 5, "werrirrr werrirrr werrirrr", "correr");
		Animal preguica = new Animal("preguiça", 2, "aaa aaa aaa", "subir em arvores");
		
		System.out.println(cachorro.getIdade());
		System.out.println(cavalo.getNome());
		System.out.println(preguica.getSom());
		
	}
	
	
}
