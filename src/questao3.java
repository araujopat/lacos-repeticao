import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {

		int idade, contador21=0,contador50=0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n Entre com uma idade: ");
		idade = leia.nextInt();
				
		while( idade != -99 ) 
			{
			if (idade < 21)
			{
				contador21++;
			}
			if(idade>50)
			{
				contador50++;
			}
			
			System.out.println("\n Entre com a idade: ");
			idade = leia.nextInt();
			
			}
		System.out.println("\nTemos: "+contador21+" pessoas com 21 anos");
		System.out.println("\nTemos: "+contador50+" pessoas com 50 anos");

	}

}
