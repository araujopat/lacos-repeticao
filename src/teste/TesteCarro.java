package teste;

public class TesteCarro {

	public static void main(String[] args) {
		carro meuCarro = new carro();
		meuCarro.cor = "vermelho";
		meuCarro.modelo = "Passat";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeAtual = 80;
		
		// chamndo os metodos
		
		meuCarro.liga();
		
		meuCarro.acelera(1);
		
		System.out.println (meuCarro.velocidadeAtual);
		

	}

}
