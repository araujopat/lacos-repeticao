package POO;

public class pessoa {
	//Atributos da Classe
	
	private String primeiroNome;//private para dar segurança aos atributos
	private String ultimoNome;//private para dar segurança aos atributos
	private String nomesDoMeio;//private para dar segurança aos atributos
	
	//Construtor (sempre carrega o nome da classe)
	
	public pessoa (String primeiro, String meio, String ultimo)
	{
		// associando os argumentos aos atributos
		//consultores não criam e nem retornam objetos, o concultor apenas vai executar o comando new
		
		primeiroNome = primeiro;
		ultimoNome = ultimo;
		nomesDoMeio = meio;
		
	}
	//criando os métodos
	
	public String getNomeCompleto() //como pegar o nome completo
	{
		String nomeCompleto = primeiroNome+" "+nomesDoMeio+" "+ ultimoNome;
		return nomeCompleto;			
		
	}
	
}
