package teste;

public class TesteInterface {
	public static void main (String [] args)
	{
		ParticipanteForum participante = new ParticipanteForum();
		Leitor leitor = participante;
		System.out.println ("O participante esta lendo: "+leitor.lendo());
		Programador programador = participante; // poderia ser programador tbm, mas o participante ja foi instanciado e engloba tbm o programador
		String java = "JAVA";
		programador.pensando(java.toCharArray());
		System.out.println("É programador: "+ programador.digitando());
		
		
	}

}
