package teste;

public class Animal {
	 String Nome;
	 int Idade;
	 String Som;
	 String tipoanimal;
	
	public Animal(String tipo)
	{
		this.tipoanimal= tipo;
	}
	public String getTipoanimal() {
		return tipoanimal;
	}
	public void setTipoanimal(String tipoanimal) {
		this.tipoanimal = tipoanimal;
	}
	public Animal (String nome, int idade, String som, String acao)
	{
		this.Nome=nome;
		this.Idade = idade;
		this.Som = som;		
						
	}
	
	
	public String getSom() {
		return Som;
	}


	public void setSom(String som) {
		Som = som;
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
