package POO;

public class pessoa {
	//Atributos da Classe
	
	private String primeiroNome;//private para dar seguran�a aos atributos
	private String ultimoNome;//private para dar seguran�a aos atributos
	private String nomesDoMeio;//private para dar seguran�a aos atributos
	
	//Construtor (sempre carrega o nome da classe)
	
	public pessoa (String primeiro, String meio, String ultimo)
	{
		// associando os argumentos aos atributos
		//consultores n�o criam e nem retornam objetos, o concultor apenas vai executar o comando new
		
		primeiroNome = primeiro;
		ultimoNome = ultimo;
		nomesDoMeio = meio;
		
	}
	//criando os m�todos
	
	public String getNomeCompleto() //como pegar o nome completo
	{
		String nomeCompleto = primeiroNome+" "+nomesDoMeio+" "+ ultimoNome;
		return nomeCompleto;			
		
	}
	
}
