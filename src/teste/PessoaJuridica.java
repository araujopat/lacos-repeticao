package teste;

public class PessoaJuridica extends Pessoa1{
	private long cnpj;
	
	// construtor vazio
	
	public PessoaJuridica ()
	{
		
	}
	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	public String getNome()
	{
		return "Pessoa Juridica" +super.getNome()+" - cnpj:"+this.getCnpj();
	}
	

}
