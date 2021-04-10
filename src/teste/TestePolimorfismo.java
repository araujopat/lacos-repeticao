package teste;

public class TestePolimorfismo {

	public static void main(String[] args) 
	{
		PessoaFisica fisica= new PessoaFisica();
		fisica.setNome("Juliana");
		fisica.setCpf(12345678902L);// L é por causa o tipo long
		
		PessoaJuridica juridica = new PessoaJuridica();
		juridica.setNome("Cristiano");
		juridica.setCnpj(10002933673092L);// L por conta do long
		
		Pessoa1[] pessoas = new Pessoa1[2];
		pessoas[0]= fisica;
		pessoas[1]= juridica;
		
		for(Pessoa1 pessoa:pessoas)
		{
			System.out.println(pessoa.getNome());
		}
	}

}
