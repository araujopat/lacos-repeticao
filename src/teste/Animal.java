package teste;

public class Animal {
	private String Nome;
	private int Idade;
	private String Som;
	
	
	public String getSom() {
		return Som;
	}


	public void setSom(String som) {
		Som = som;
	}


	public Animal (String nome, int idade, String som, String acao)
	{
		this.Nome=nome;
		this.Idade = idade;
		this.Som = som;		
		
				
	}


	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}


	

}
