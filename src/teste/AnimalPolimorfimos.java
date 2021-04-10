package teste;

public abstract class AnimalPolimorfimos {
	String Nome;
	 int Idade;
	 String Som;
	 String Acao;
	
	abstract public void Nome (String Nome);
	abstract public void Idade (int Idade);
	abstract public void Som (String Som);
	abstract public void Acao (String Acao);
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
	public String getSom() {
		return Som;
	}
	public void setSom(String som) {
		Som = som;
	}
	public String getAcao() {
		return Acao;
	}
	public void setAcao(String acao) {
		Acao = acao;
	}
	
	
	}
