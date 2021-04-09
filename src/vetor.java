import java.util.Scanner;

public class vetor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int [] arrayUm = { 12, 3, 5, 68, 9, 6, 73, 44, 456, 65, 321};//declaração do array
		int [] arrayDois = { 43, 42, 4, 8, 55, 21, 2, 45};// declaração do array
		
		float [] nota = new float [5]; 
		
		//tamanhoo do array
		if (arrayDois.length > 8)
		{ 
			System.out.println("Tamanho do ArrayDois - Maior que 8!");
			
		}else {
			
			System.out.println("Tamanho do ArrayDois - Menor que 8!");
		}
		System.out.println("\nTamanho do ArrayUm = "+ arrayUm.length);		
		
		//Utilização do for-each
		String [] cars = {"Volvo", "", "Ford", "Mazda"};
		
		for (String i : cars)
		{
			System.out.println(i);
		}
		
		// populando um array
		
		for (int i=0; i<5; i++)
		{
			System.out.println("Entre com uma nota: ");
			nota [i] = entrada.nextFloat();// a variavel contador vai de 0 a 4, ou seja 5 posições a serem lidas
		}
		
		// apresentando um array
		for (int i=0; i<5; i++)
		{
			System.out.println("Nota "+ i+1 + "="+ nota [i] );

		}
		
	}
}
		