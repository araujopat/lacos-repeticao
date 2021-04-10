package teste;

public class PessoaFisica extends Pessoa1 {
	private long cpf;
	//construtor vazio
	public PessoaFisica()
	{
		
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	// médodo herdado da superclasse Pessoa

	public String getNome()
	{
		return "Pessoa Fisica: "+super.getNome()+" -CPF"+ this.getCpf();
		
	}

}
