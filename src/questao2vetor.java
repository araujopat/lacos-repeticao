import java.util.Scanner;

public class questao2vetor {

		public static void main(String[] args) 
		{
			int[] numeros = new int[6];// define o tamanho do vetor
			
			int somaPar=0,contImpar=0;
			
			Scanner leia = new Scanner(System.in);
			
			for(int i=0;i<6;i++) // la�o para o usuario entrar com 6 numeros inteiros
			{
				System.out.println("\nEntre com o "+(i+1)+"o. n�mero: ");
				numeros[i] = leia.nextInt();
				
				if(numeros[i]%2==0) // Dos 6 numeros digitados quantos s�o pares
				{
					somaPar = somaPar + numeros[i];
				}
				else // se n�o s�o pares s�o impares.
				{
					contImpar++;
				}
			}
			
			for(int i=0;i<6;i++) // la�o para separar pares de impares
			{
				if(numeros[i]%2==0)
				{
					System.out.println(numeros[i]+" <-- � um n�mero par");
				}
				else
				{
					System.out.println(numeros[i]+" <-- � um n�mero �mpar");
				}
			}
			System.out.println("\nSoma dos n�meros pares: "+somaPar);
			
			System.out.println("\nQuantidade de n�meros impares: "+contImpar);
		

	}

}
